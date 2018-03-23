# -*- coding: utf-8 -*-
"""14. Leia 3 notas de um aluno e o peso de cada nota, calcule e escreva a média ponderada."""
aluno = input('Digite o nome do aluno: ')
n1 = float(input('Digite a primeira nota: '))
p1 = int(input('Digite o peso da primeira nota: '))
n2 = float(input('Digite a segunda nota: '))
p2 = int(input('Digite o peso da segunda nota: '))
n3 = float(input('Digite a terceira nota: '))
p3 = int(input('Digite o peso da terceira nota: '))
media = (p1*n1+p2*n2+p3*n3)/(p1+p2+p3)
print ('A média ponderada do(a) aluno (a) %s, referente às notas %.1f, %.1f e %.1f de pesos %1.f, %.1f e %.1f é: %.2f' % (aluno, n1,n2, n3,p1, p2, p3, media))

