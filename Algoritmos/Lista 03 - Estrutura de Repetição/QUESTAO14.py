"""14. Leia N, calcule e escreva o maior quadrado menor ou igual a N. Por exemplo, se N for igual a 38, o maior quadrado menor
que 38 é 36 (quadrado de 6). """
print('Questão 14.')
def main ():
    n = int (input('Digite um número: '))
    quadrado = 0
    i = 1
    quadrado_menor_que_n(n, quadrado, i)
    
def quadrado_menor_que_n (num, quadrado, i):
    while quadrado <= num:
        quadrado = i * i
        i += 1
        if quadrado >= num:
            i -= 2
            quadrado = i * i
            print(quadrado)
            break
if __name__ == '__main__':
    main()