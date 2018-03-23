# -*- coding: utf-8 -*-
"""20. Leia uma temperatura em °C, calcule e escreva a equivalente em °F.  (t°F = (9 * t°C + 160) / 5) """
temp_c = float(input('Digite a temperatura em ºC: '))
temp_f = (9* temp_c + 160)/5
print ('A temperatura %.1f ºC equivale a %.1f ºF.' % (temp_c, temp_f))
