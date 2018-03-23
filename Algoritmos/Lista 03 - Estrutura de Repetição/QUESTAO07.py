'''07. Leia um número N, some todos os números inteiros entre 1 e N e escreva o resultado obtido.'''

print('Questão 07.')
numero = int(input('Informe um valor limite: '))
contador = 0

def total(contador, numero):
    for soma in range(1, numero+1):
        resultado = contador + soma
        contador += soma
    return contador

print(total(contador,numero))