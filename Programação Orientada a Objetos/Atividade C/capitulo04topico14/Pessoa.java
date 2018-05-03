package capitulo04topico14;

public class Pessoa {
	String nome;
	int idade;
	
	void fazAniversario(){
		idade += 1;
	}
	
	void imprime(){
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
	}
}
