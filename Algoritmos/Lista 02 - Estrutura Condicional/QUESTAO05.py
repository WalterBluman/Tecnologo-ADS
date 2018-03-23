# -*- coding: utf-8 -*-
def ordenar(n1,n2,n3):
    if n1<n2<n3:
        print(n1,n2,n3)
    if n3<n2<n1:
        print(n3,n2,n1)
    if n2<n1<n3:
        print(n2,n1,n3)
    if n2<n3<n1:
        print(n2,n3,n1)
    if n1<n3<n2:
        print(n1,n3,n2)
    if n3<n1<n2:
        print(n3,n1,n2)

def main():
    print("digite tres numeros")
    num1 = float(input("escreva primeiro numero: "))
    num2 = float(input('escreva segundo numero: '))
    num3 = float(input('escreva terceiro numero: '))
    resultado = ordenar(num1,num2,num3)
    print(resultado)

if __name__ == '__main__':
    main()
