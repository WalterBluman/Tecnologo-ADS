package capitulo04topico12;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada(){
		String data = this.dia + "/" + this.mes + "/" + this.ano;
		return data;
	}
	
}
