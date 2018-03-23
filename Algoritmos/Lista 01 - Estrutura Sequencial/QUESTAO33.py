# -*- coding: utf-8 -*-
"""33. Leia um número inteiro (3 dígitos), calcule e escreva a soma do número com seu inverso.   """
num = int(input('Digite um número inteiro composto por 3 algarismos: '))
x = num/100
y = x%10
z = num%10
inverso = (z*100 + y*10 +x)
soma= num+inverso
print ('O número que você digitou foi %i, o inverso dele é %i e a soma do numero mais o seu inverso é %i' % (num, inverso, soma))
