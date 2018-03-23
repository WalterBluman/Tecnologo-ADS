""" 25. Em uma eleição presidencial existem 3 (três) candidatos. Os votos são informados através de códigos.
Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
· 1, 2, 3 = voto para os respectivos candidatos;   · 9 = voto nulo;   · 0 = voto em branco;
Escreva um algoritmo que leia o código votado por N eleitores. Ao final, calcule e escreva:
a) total de votos para cada candidato;   b) total de votos nulos;   c) total de votos em branco; d) quem venceu a eleição.
"""
print('Questão 25.')
def main():
    voto = int(input('Digite o seu voto /0- Branco/1- Fulano/2- Beltrano/3- Cicrano/9- Nulo/4- FIM): '))
    eleicao(voto,0,0,0,0,0,0,0)

def eleicao (voto,eleitores, cont_1, cont_2, cont_3, cont_9, cont_0, vencedor):
    while voto != 4:
        if voto == 1 or voto == 2 or voto == 3 or voto == 9 or voto == 0:
            eleitores += 1

            if voto == 1:
                cont_1 += 1
            if voto == 2:
                cont_2 += 1
            if voto == 3:
                cont_3 += 1
            if voto == 9:
                cont_9 += 1
            if voto == 0:
                cont_0 += 1
            voto = int(input('Digite o seu voto /0- Branco/1- Fulano/2- Beltrano/3- Cicrano/9- Nulo/4- FIM): '))

    else:
        if cont_1 > cont_2 and cont_1 > cont_3 and  cont_1 > cont_9 and  cont_1 > cont_0:
            vencedor = "O candidato vencedor é: /1- Fulano/"
        elif cont_2 > cont_1 and cont_2 > cont_3 and  cont_2 > cont_9 and  cont_2 > cont_0:
            vencedor = "O candidato vencedor é: /2- Beltrano/"
        elif cont_3 > cont_1 and cont_3 > cont_2 and  cont_3 > cont_9 and  cont_3 > cont_0:
            vencedor = "O candidato vencedor é: /3- Cicrano/"
        elif cont_9 > cont_1 and cont_9 > cont_2 and  cont_9 > cont_3 and  cont_9 > cont_0:
            vencedor = "A maioria dos votos foi /9- NULO/"
        elif cont_0 > cont_1 and cont_0 > cont_2 and  cont_0 > cont_3 and  cont_1 > cont_9:
            vencedor =  "A maioria dos votos foi /0- BRANCO/"

    print('=============================================')
    print('Nesta eleição tivemos %d eleitores presentes.'  % eleitores)
    print('O candidato /1- Fulano/ obteve %d votos.' % cont_1)
    print('O candidato /2- Beltrano/ obteve %d votos.' % cont_2)
    print('O candidato /3- Cicrano/ obteve %d votos.' % cont_3)
    print('Total de nulos: %d' % cont_9)
    print('Total de brancos: %d' % cont_0)
    print (vencedor)

if __name__ == '__main__':
    main()



