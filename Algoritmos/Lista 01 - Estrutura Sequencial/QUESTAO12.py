# -*- coding: utf-8 -*-
"""12. Leia o salário de um trabalhador e escreva seu novo salário com um aumento de 25%."""
nome = input('Digite o nome do(a) colaborador(a): ')
salario = float(input('Digite o atual salário do(a) colaborador(a) citado acima: '))
aumento = salario + salario*0.25
print ('O novo salário do(a) senhor(a) %s será de RS%.2f ' % (nome, aumento))
