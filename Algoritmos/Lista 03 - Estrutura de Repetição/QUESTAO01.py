"""1. Leia N e escreva todos os números inteiros de 1 a N."""
print('Questão 01:')

def main():
    n = int(input('Digite um número: '))
    for n in range(1, n + 1):
        print (n)

if __name__ == '__main__':
    main()
