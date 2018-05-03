package capitulo04topico12;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 1000;
		
		Data data = new Data();
		f1.dataDeEntrada = data;
		
		Funcionario f2 = f1;
		
		f1.mostra();
		f2.mostra();
		
		if (f1 == f2){
			System.out.println("Iguais!");
		}else{
			System.out.println("Diferentes!");
		}
	}
}
