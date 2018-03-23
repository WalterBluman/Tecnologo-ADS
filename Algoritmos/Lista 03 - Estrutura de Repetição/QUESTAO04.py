""" 4. Leia as variáveis A0, Limite e R e escreva os valores menores que Limite gerados pela
Progressão Geométrica que tem por valor inicial A0 e razão R.
"""
print('Questão 04:')

def main ():
    razao = int(input('Digite a razão da PG: '))
    limite = int(input('Digite o limite da PG: '))
    a0 = 1
    pg(a0, razao, limite)


def pg (a, razao, limite):
   for i in range (a, limite + 1, razao):
        ax = a * razao
        a = ax
        if ax <= limite:
            print('PG:%d ' % (ax))



if __name__ == '__main__':
    main()

