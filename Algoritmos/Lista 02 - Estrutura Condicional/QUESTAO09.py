# -*- coding: utf-8 -*-
def prova_primos(num):
    if num/2:
        print('numero nao é primo')
    if num/3:
        print('numero nao é primo')
    if num/5:
        print('numero nao é primo')
    if num/7:
        print('numero nao é primo')
    else:
        print('numero é primo')


def main():
    numero = int(input('escreva um numero de 0 a 100: '))
    resultado = prova_primos(numero)
    print(resultado)

if __name__ == '__main__':
    main()

