# -*- coding: utf-8 -*-
"""21. Leia uma temperatura em °F, calcule e escreva a equivalente em °C.  (t°C = (5 * t°F - 160) / 9). """
temp_f = float(input('Digite a temperatura em ºF: '))
temp_c =  (5 * temp_f - 160)/9
print ('A temperatura %.1f ºF  equivale a %.1f ºC.' % (temp_f, temp_c))
