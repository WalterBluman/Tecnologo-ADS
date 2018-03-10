﻿
-- ..Tabelas.. -------------------------------------------------------------------------------------------

CREATE TABLE ENDERECO(
	ID_ENDERECO SERIAL PRIMARY KEY,
	CIDADE VARCHAR(45) NOT NULL,
	BAIRRO VARCHAR(45) NOT NULL,
	LOGRADOURO VARCHAR(45) NOT NULL,
	NUMERO INT NOT NULL
);

CREATE TABLE USUARIO(
	ID_USER SERIAL PRIMARY KEY,
	NOME VARCHAR(45) NOT NULL,
	ID_ENDERECO INT NOT NULL REFERENCES ENDERECO(ID_ENDERECO)
	
);

CREATE TABLE ENTREGADOR(
	ID_ENTREGADOR SERIAL PRIMARY KEY,
	NOME VARCHAR(45),
	TELEFONE VARCHAR(45)
);

CREATE TABLE PEDIDO(
	ID_PEDIDO SERIAL PRIMARY KEY,
	DATA_PEDIDO DATE,
	VALOR_TOTAL REAL,
	STATUS VARCHAR(1) CHECK (STATUS='A' OR STATUS='F' OR STATUS='C'),
	ID_USER INT NOT NULL REFERENCES USUARIO(ID_USER),
	ID_ENTREGADOR INT REFERENCES ENTREGADOR(ID_ENTREGADOR)
);

--ALTER TABLE PEDIDO ADD STATUS VARCHAR(1) CHECK (STATUS='A' OR STATUS='F' OR STATUS='C')

CREATE TABLE PRATO(
	ID_PRATO SERIAL PRIMARY KEY,
	NOME VARCHAR(45) NOT NULL,
	DESCRICAO VARCHAR(100) NOT NULL
);

CREATE TABLE RESTAURANTE(
	ID_RESTAURANTE SERIAL PRIMARY KEY,
	NOME VARCHAR(45) NOT NULL,
	CNPJ VARCHAR(20),
	TELEFONE VARCHAR(45),
	ID_ENDERECO INT NOT NULL REFERENCES ENDERECO(ID_ENDERECO)
);

CREATE TABLE ITEM_PEDIDO(
	ID_PEDIDO INT REFERENCES PEDIDO(ID_PEDIDO),
	ID_PRATO INT REFERENCES PRATO(ID_PRATO),
	ID_RESTAURANTE INT NOT NULL REFERENCES RESTAURANTE(ID_RESTAURANTE),
	PRECO REAL NOT NULL,
	QUANTIDADE INT NOT NULL,
	CONSTRAINT CHAVE PRIMARY KEY(ID_PEDIDO,ID_PRATO)
);

CREATE TABLE ESTOQUE(
	ID_RESTAURANTE INT NOT NULL REFERENCES RESTAURANTE(ID_RESTAURANTE),
	ID_PRATO INT NOT NULL REFERENCES PRATO(ID_PRATO),
	QUANTIDADE INT NOT NULL,
	PRECO REAL NOT NULL,
	CONSTRAINT CHAVE_ESTOQUE PRIMARY KEY(ID_RESTAURANTE,ID_PRATO)
);

-- ..Funções.. -------------------------------------------------------------------------------------------

--INSERIR
CREATE OR REPLACE FUNCTION inserir(tabela TEXT, valores TEXT)
RETURNS VOID AS $$
DECLARE
	command TEXT := 'INSERT INTO ' || $1 || ' VALUES ('|| $2 || ');';
BEGIN
	EXECUTE command;
END;

$$ LANGUAGE plpgsql

--UPDATE
CREATE or REPLACE FUNCTION atualizar(tabela TEXT, nome TEXT, valores TEXT)
RETURNS VOID AS $$
DECLARE

	tab TEXT;
	command TEXT := 'UPDATE ' || $1 || ' SET ' || $3 || ' WHERE nome = '''|| $2 ||''';';
	command_endereco TEXT := 'UPDATE ' || $1 || ' SET ' || $3 || ' WHERE id_endereco = '''|| $2 ||''';';
BEGIN
	SELECT tabela into tab;
	IF (tab = 'endereco' OR tab = 'ENDERECO') THEN
		EXECUTE command_endereco;
	ELSE 
		EXECUTE command;
	END IF;
END;

$$ LANGUAGE plpgsql

--DELETAR
CREATE or REPLACE FUNCTION deletar(tabela TEXT, nome TEXT)
RETURNS VOID AS $$
DECLARE
	command TEXT := 'DELETE FROM ' || $1 || ' WHERE NOME = ''' || $2 ||''';';
BEGIN
	EXECUTE command;
END;

$$ LANGUAGE plpgsql


-- ALTERAR STATUS DO PEDIDO
CREATE OR REPLACE FUNCTION altera_status(status TEXT, id_alterar INT)
RETURNS VOID AS $$

BEGIN
	UPDATE PEDIDO SET STATUS = $1 WHERE ID_PEDIDO = $2;
END;

$$ LANGUAGE plpgsql


-- REALIZAR PEDIDO
CREATE OR REPLACE FUNCTION realiza_pedido(prato_nome TEXT , retaurante_nome TEXT, quant INT,usuario_nome TEXT)
RETURNS VOID AS $$

DECLARE
	restaurante INT;
	usuario INT;
	pedido INT;
	prato INT;
	valor REAL;
BEGIN

  SELECT ID_RESTAURANTE INTO restaurante FROM RESTAURANTE WHERE nome = $2;
  SELECT ID_USER INTO usuario FROM USUARIO WHERE nome = $4;
  SELECT ID_PRATO INTO prato FROM PRATO WHERE nome = $1;
  
  IF (restaurante IS NOT NULL AND usuario IS NOT NULL AND prato IS NOT NULL) THEN
    SELECT $3 * (SELECT PRECO FROM ESTOQUE WHERE ID_RESTAURANTE = restaurante AND ID_PRATO = prato) INTO valor;
    INSERT INTO PEDIDO VALUES(DEFAULT,CURRENT_DATE,valor, usuario, 1) RETURNING ID_PEDIDO INTO pedido;
    INSERT INTO ITEM_PEDIDO VALUES(pedido,prato,restaurante,200,$3);
    UPDATE ESTOQUE SET QUANTIDADE = (SELECT QUANTIDADE FROM ESTOQUE WHERE ID_RESTAURANTE = restaurante AND ID_PRATO = prato) - $3
    WHERE ID_RESTAURANTE = restaurante AND ID_PRATO = prato;
  ELSE
    RAISE 'DEU RUIM';
  END IF;
  
END;

$$ LANGUAGE 'plpgsql';

-- ..Triggers.. -------------------------------------------------------------------------------------------

CREATE TRIGGER checar_usuario BEFORE INSERT OR UPDATE OR DELETE
ON PRATO 
EXECUTE PROCEDURE checar_usuario(); 

CREATE TRIGGER checar_usuario BEFORE INSERT OR UPDATE OR DELETE
ON PEDIDO 
EXECUTE PROCEDURE checar_usuario();

CREATE TRIGGER checar_estoque BEFORE INSERT OR UPDATE
ON ITEM_PEDIDO 
FOR EACH ROW EXECUTE PROCEDURE checar_estoque();

CREATE TRIGGER checar_numero_positivo BEFORE INSERT OR UPDATE
ON ITEM_PEDIDO 
FOR EACH ROW EXECUTE PROCEDURE checar_numero_positivo();

CREATE TRIGGER checar_numero_positivo BEFORE INSERT OR UPDATE
ON ESTOQUE 
FOR EACH ROW EXECUTE PROCEDURE checar_numero_positivo();

drop trigger checar_estoque on item_pedido


CREATE OR REPLACE FUNCTION checar_usuario() 
RETURNS TRIGGER AS $$

DECLARE
	usuario TEXT;

BEGIN
	SELECT USER INTO usuario;
	IF (TG_TABLE_NAME = 'prato') THEN

       	  IF usuario NOT LIKE 'restaurante' AND usuario NOT LIKE 'postgres' THEN 
	  	  RAISE EXCEPTION 'O USUÁRIO NAO TEM PERMISSÃO PARA REALIZAR ALTERAÇÕES NESSES DADOS!';
	  END IF;

	ELSIF (TG_TABLE_NAME = 'pedido') THEN
	
	  IF usuario NOT LIKE 'cliente' AND usuario NOT LIKE 'postgres' THEN 
	  	  RAISE EXCEPTION 'O CLIENTE NAO TEM PERMISSÃO PARA REALIZAR ALTERAÇÕES NESSES DADOS!';
	  END IF;
	  
	END IF;
	RETURN NEW;
END;

$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION checar_estoque() 
RETURNS TRIGGER AS $checar_estoque$
DECLARE
	quant INT;
		
BEGIN	
	
	SELECT QUANTIDADE INTO quant FROM ESTOQUE WHERE ID_RESTAURANTE = NEW.id_restaurante  AND ID_PRATO = NEW.id_prato;

	IF (quant IS NOT NULL) THEN
	  IF (quant < NEW.quantidade) THEN
		  DELETE FROM PEDIDO WHERE ID_PEDIDO = NEW.ID_PEDIDO;
		  RAISE 'QUANTIDADE INSUFICIENTE NO ESTOQUE'; 
	  END IF;
	ELSE
	  RAISE 'NÃO EXISTE ESSE PRODUTO NO ESTOQUE';
	END IF;
	
	RETURN NEW;
END;

$checar_estoque$ LANGUAGE plpgsql;


-- ..Usuarios.. -------------------------------------------------------------------------------------------
CREATE USER CLIENTE WITH PASSWORD '123'
CREATE USER RESTAURANTE WITH PASSWORD '123'

-- ..Indices.. -------------------------------------------------------------------------------------------
CREATE INDEX ID_PEDIDO ON PEDIDO USING BTREE(DATA_PEDIDO)

VACUUM FULL VERBOSE ANALYZE
CREATE ROLE GERENTE WITH SUPERUSER
CREATE GROUP AAA WITH LOGIN
ALTER GROUP AAA ADD USER MANAGER

-- ..Views.. -------------------------------------------------------------------------------------------
CREATE OR REPLACE VIEW PEDIDO_LEGIVEL AS
SELECT P.ID_PEDIDO, U.NOME AS CLIENTE, P.DATA_PEDIDO, P.VALOR_TOTAL, E.NOME AS ENTREGADOR
FROM PEDIDO P INNER JOIN USUARIO U ON U.ID_USER = P.ID_USER INNER JOIN ENTREGADOR E ON E.ID_ENTREGADOR = P.ID_ENTREGADOR

SELECT * FROM PEDIDO

CREATE OR REPLACE VIEW ESTOQUE_LEGIVEL AS
SELECT R.NOME AS RESTAURANTE, P.NOME AS PRATO, E.QUANTIDADE, E.PRECO
FROM RESTAURANTE R INNER JOIN ESTOQUE E ON R.ID_RESTAURANTE= E.ID_RESTAURANTE INNER JOIN PRATO P ON E.ID_PRATO = P.ID_PRATO

SELECT * FROM ESTOQUE_LEGIVEL


-- ..Testando.. -------------------------------------------------------------------------------------------

SELECT * FROM ENTREGADOR
SELECT * FROM USUARIO ORDER BY ID_ENDERECO
SELECT * FROM RESTAURANTE
SELECT * FROM PRATO
SELECT * FROM ESTOQUE
SELECT * FROM ENDERECO ORDER BY ID_ENDERECO


SELECT INSERIR('ENTREGADOR', '''Fulano'', ''3222-3030''')
SELECT INSERIR('USUARIO', '''EVALDO'', 1')
SELECT INSERIR('RESTAURANTE', '''AIKO'', ''098763542'', ''3232-0033'', 3')
SELECT INSERIR('ESTOQUE', '1, 5, 200, 4')

SELECT ATUALIZAR('ENDERECO', '3', 'cidade=''TIMON''')
SELECT ATUALIZAR('USUARIO','SYWRAH','nome=''INATIVO'' ')

UPDATE ENDERECO SET CIDADE='INATIVO',BAIRRO='INATIVO', LOGRADOURO= 'INATIVO', NUMERO=0 WHERE ID_ENDERECO=1

SELECT DELETAR('ENTREGADOR', 'Maria')
SELECT DELETAR('RESTAURANTE', 'restaurante 1')
SELECT DELETAR('USUARIO', 'SYWRAH')

SELECT REALIZA_PEDIDO('SUSHI','AIKO',10,'EVALDO')

















