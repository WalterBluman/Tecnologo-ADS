"""2. Leia um valor em horas e um valor em minutos, calcule e escreva o equivalente em minutos."""
horas = int(input('Digite a hora(sem os minutos): '))
minutos = int(input('Digite os minutos: '))
total = (horas * 60) + minutos

print('O equivalente de ', horas,'h',minutos, 'm em minutos é: ', total)
