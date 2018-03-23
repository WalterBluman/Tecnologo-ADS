'''Uma determinada empresa armazena para cada funcionário uma ficha contendo o código, o número de 
horas trabalha
das e o seu nº de dependentes. Considerando que a empresa paga R$ 12,00 por hora e R$ 
40,00 por dependentes e que sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR. 
Escreva um algoritmo que leia o código, número de horas trabalhadas e número de dependentes de N 
funcionários. Após a leitura de cada ficha, escreva os valores descontados para cada imposto e o salário 
líquido do funcionário.'''
print('Atividade 23')
print('Cálculo de Salário dos funcionários')
funcionarios = int(input('Informe o total de funcionários: '))
for ficha in list(range(1, funcionarios+1)):
    codigo = int(input('Informe o codigo do funcionario: '))
    dependentes = int(input('Informe o total de dependentes: '))
    horas_trabalhadas = int(input('Informe a quantidade de horas trabalhadas: '))
    salario = float(input('Informe o salário do funcionario: '))
    salario_bruto = salario + (dependentes*40) + (horas_trabalhadas*12)
    inss = salario_bruto * (8.5/100)
    ir = salario_bruto * (5/100)
    total_salario = salario_bruto - inss - ir
    print('=============================')
    print('Informações sobre o funcionário: %d' % codigo)
    print('Desconto do INSS: R$%.2f' % inss)
    print('Desconto do IR: R$%.2f' % ir)
    print('Salário total sem desconto: R$%.2f' % salario_bruto)
    print('Salário total com desconto: R$%.2f' % total_salario)
    print('=============================')
print(lista)