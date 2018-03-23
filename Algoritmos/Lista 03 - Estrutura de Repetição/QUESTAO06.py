"""6. Escreva a tabuada dos números de 1 a 10. """

print('Questão 06:')
print('Hora da Tabuada :) kk')
def main():
    for tabuada in range (1, 11):
        for multilplos in range(0, 11):
            resultado = int(tabuada * multilplos)
            print('{} x {} = {}'.format(tabuada,multilplos,resultado))

if __name__ == '__main__':
    main()