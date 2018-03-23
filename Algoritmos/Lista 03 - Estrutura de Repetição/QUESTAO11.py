'''11. Leia LimiteSuperior e LimiteInferior e escreva todos os números primos entre os limites lidos.'''
print('Questão 11:')
def main ():
    limite_inferior = int(input('Digite o limite inferior da lista: '))
    limite_superior = int(input('Digite o limite superior da lista: '))
    range (limite_inferior, limite_superior + 1)
    x = 1
    divisores = 0
    numerosprimos(limite_inferior, limite_superior, divisores, x)

def numerosprimos(limite_inferior, limite_superior, divisores, x):
    for item in range (limite_inferior, limite_superior + 1):
        while x <= item:
            if item % x == 0:
                divisores +=1
            x +=1

        if divisores == 2:
            print('%d é Primo!' % item)
        else:
            print('%d NÃO é Primo!' % item)
        x = 1
        divisores = 0

if __name__ == '__main__':
    main()
