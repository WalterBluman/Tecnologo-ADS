# -*- coding: utf-8 -*-
"""7. Leia 3 números, calcule e escreva a soma dos 2 primeiros e a diferença entre os 2 últimos. """
n1 = float(input('Digite o primeiro número: '))
n2 = float(input('Digite o segundo número: '))
n3 = float(input('Digite o terceiro número: '))
soma = n1+n2
diferenca = n2-n3
print ('A soma entre os dois primeiros números (%.1i e %.1i) é %.1i. E a diferença entre os dois ultimos (%.1i e %.1i) é %.1i. ' % (n1,n2, soma, n2, n3, diferenca))
