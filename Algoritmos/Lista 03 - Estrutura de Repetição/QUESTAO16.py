""" 16. Leia um número N, calcule e escreva os N primeiros termos de seqüência de Fibonacci (0,1,1,2,3,5,8,...).
O valor lido para N sempre será maior ou igual a 2.
"""
print('Questão 16.')
def main ():
    n = int (input('Digite um número maior ou igual a 2: '))
    penultimo = 0
    ultimo = 1
    print (penultimo, ultimo,)
    for i in range(n - 2):
        atual = penultimo + ultimo
        penultimo = ultimo
        ultimo = atual
        print (atual,)

if __name__ == '__main__':
    main()