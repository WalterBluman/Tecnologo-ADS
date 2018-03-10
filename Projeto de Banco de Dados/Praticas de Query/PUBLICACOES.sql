CREATE TABLE ASSUNTO(
    cod_assun SERIAL PRIMARY KEY, 
    descricao VARCHAR(45));
    
CREATE TABLE EDITORA(
    cod_editora SERIAL PRIMARY KEY, 
    cnpj VARCHAR(45), 
    razaosocial varchar(10));
    
CREATE TABLE AUTOR(
    cod_autor SERIAL PRIMARY KEY, 
    cpf VARCHAR(45), nome varchar(25), 
    dt_nasc DATE, 
    cod_nacional INT NOT NULL REFERENCES NACIONALIDADE(cod_nacional));
    
CREATE TABLE LIVRO(
    cod_livro SERIAL PRIMARY KEY, 
    ISBN VARCHAR(45), 
    titulo varchar(25),
    preco FLOAT ,
    dataLancamento DATE, 
    cod_assun INT NOT NULL REFERENCES ASSUNTO(cod_assun), 
    cod_editora INT NOT NULL REFERENCES EDITORA(cod_editora));
    
CREATE TABLE AUTOR_LIVRO(
    cod_autor INT NOT NULL REFERENCES AUTOR(cod_autor), 
    cod_livro INT NOT NULL REFERENCES LIVRO(cod_livro));
    
CREATE TABLE NACIONALIDADE(
    cod_nacional SERIAL PRIMARY KEY, 
    decricao VARCHAR(45));
        
/**QUESTÃO 01:**/
    SELECT * FROM LIVRO WHERE preco > 50
/**QUESTÃO 02:**/ 
	SELECT * FROM LIVRO WHERE preco BETWEEN 100 and 200
/**QUESTÃO 03:**/
	SELECT * FROM LIVRO WHERE titulo LIKE '%Banco%'
/**QUESTÃO 04:**/
	SELECT * FROM LIVRO WHERE titulo LIKE 'Banco%'
/**QUESTÃO 05:**/
	SELECT * FROM LIVRO WHERE titulo LIKE '%Dados'
/**QUESTÃO 06:**/
	SELECT * FROM LIVRO WHERE titulo LIKE '%Banco de Dados%' or titulo LIKE '%Bancos de Dados%'
/**QUESTÃO 07:**/
	SELECT * FROM LIVRO WHERE dataLancamento < Now() - INTERVAL '5 YEAR'
    SELECT EXTRACT AGE(CURRENT_DATE, DATALANCAMENTO) FROM LIVRO
/**QUESTÃO 08:**/
	SELECT * FROM LIVRO WHERE dataLancamento IS NULL
/**QUESTÃO 09:**/
	SELECT * FROM LIVRO L INNER JOIN ASSUNTO ASS ON L.cod_assun = ASS.cod_assun WHERE descricao = 'Estrutura de Dados'
/**QUESTÃO 10:**/
	SELECT * FROM LIVRO L INNER JOIN ASSUNTO ASS ON L.cod_assun = ASS.cod_assun WHERE ASS.cod_assun BETWEEN 1 AND 3
/**QUESTÃO 11:**/
	SELECT COUNT(*) FROM LIVRO
/**QUESTÃO 12:**/
	SELECT COUNT(*) FROM LIVRO WHERE dataLancamento IS NULL
/**QUESTÃO 13:**/
	SELECT SUM(preco) FROM LIVRO
/**QUESTÃO 14:**/
	SELECT AVG(preco) FROM LIVRO
/**QUESTÃO 15:**/
	SELECT MAX(preco) FROM LIVRO
/**QUESTÃO 16:**/
	SELECT MIN(preco) FROM LIVRO
/**QUESTÃO 17:**/
	SELECT AVG(PRECO) FROM LIVRO GROUP BY cod_assun
    SELECT DESCRICAO, AVG(PRECO) FROM LIVRO NATURAL JOIN ASSUNTO GROUP BY DESCRICAO
/**QUESTÃO 18:**/
	SELECT COUNT(PRECO) FROM LIVRO GROUP BY cod_assun
/**QUESTÃO 19:**/
	SELECT * FROM LIVRO WHERE preco = (SELECT MAX(preco) FROM LIVRO GROUP BY cod_assun) AND dataLancamento IS NOT NULL
/**QUESTÃO 20:**/

/**QUESTÃO 28:**/
	SELECT COUNT(*) FROM AUTOR
/**QUESTÃO 73:**/
	SELECT 
    
    
    
    
    
    
    
    



