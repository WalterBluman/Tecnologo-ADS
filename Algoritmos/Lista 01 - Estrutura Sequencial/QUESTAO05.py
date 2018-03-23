# -*- coding: utf-8 -*-
"""05. Leia um numero inteiro (3 digitos), calcule e escreva a soma de seus elementos (C + D + U)."""
valor = int(input ('Digite um número inteiro de 3 dígitos: '))
c = valor/ 100
d = (valor % 100)/ 10
u = (valor % 10)
total = c + d + u
print ('A soma dos três dígitos do valor %d é %d.' % (valor, total))
