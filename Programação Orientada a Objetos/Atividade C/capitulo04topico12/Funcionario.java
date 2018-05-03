package capitulo04topico12;

public class Funcionario {
	String nome, rg, departamento;
	Data dataDeEntrada;
	double salario;
	
	void recebeAumento(double valor){
		this.salario += valor;
	}
	
	void descontaSalario(double valor){
		this.salario -= valor;
	}
	
	void mostra(){
		System.out.println("------ Funcionário ------");
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
		System.out.println("Salário atual: " + this.salario);
	}
	
	double calculaGanhoAnual(){
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
		
	}
	
	
	
}
