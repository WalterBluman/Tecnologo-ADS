""" 10. Leia LimiteSuperior e LimiteInferior e escreva todos os números ímpares entre os limites lidos. """
print('Questão 10.')
def main():
    limite_inferior = int(input('Digite o limite inferior: '))
    limite_superior = int(input('Digite o limite superior: '))
    range (limite_inferior, limite_superior + 1)
    imprime_impares(limite_inferior, limite_superior)

def imprime_impares (limite_inferior, limite_superior):
    for item in range (limite_inferior, limite_superior + 1):
        if item % 2 != 0:
            print(item,)
        else:
            pass

if __name__ == '__main__':
    main()