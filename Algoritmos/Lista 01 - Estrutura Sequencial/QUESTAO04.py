"""4. Leia o valor do dolar e um valor em dolar, calcule e escreva o equivalente em real (R$)."""
cotacao = float(input ('Digite a cotação do dólar: '))
valor_dolar = float(input ('Digite um valor em dólar: '))
valor_reais = valor_dolar * cotacao
print ('O valor %.2f dólares com cotação %.2f equivale a %.2f reais' % (valor_dolar, cotacao, valor_reais))
