"""5. Leia um número, calcule e escreva seu fatorial."""

print('Questão 05:')
def main():
    numero = int (input('Digite um numero: '))
    resposta = fatorial(numero)
    print ('Fatorial de %d é %d.' % (numero, resposta))

def fatorial(numero):
    if numero == 0:
        return 1
    else:
        resultado = numero * fatorial(numero - 1)
        return resultado


if __name__ == '__main__':
    main()
