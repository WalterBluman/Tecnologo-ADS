# -*- coding: utf-8 -*-
def verifica_numeros (numero1, numero2, numero3):
    if numero1 == numero2 == numero3:
        print ('Os três números digitados são iguais.')

    elif numero1 == numero2  or  numero2 == numero3 or numero1 == numero3:
        print ('Apenas dois dos números digitados são iguais')
    else:
        print ('Nenhum dos números digitados são iguais')

def main():
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    num3 = float(input('Digite o terceiro número: '))
    verifica_numeros(num1, num2, num3)

if __name__ == '__main__':
    main()
