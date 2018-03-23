# -*- coding: utf-8 -*-
"""6. Leia uma velocidade em km/h, calcule e escreva esta velocidade em m/s.  (Vm/s = Vkm/h / 3.6) """
velo_km = float(input('Digite uma velocidade em Km/h: '))
velo_ms = velo_km/3.6
print ('A velocidade %.1f Km/h equivale a %.1f m/s.' %(velo_km, velo_ms))
