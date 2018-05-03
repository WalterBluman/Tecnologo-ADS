package capitulo04topico14;

public class Casa {
	Porta porta1;
	Porta porta2;
	Porta porta3;
	String cor;
	
	void pintaCasa(String novaCor){
		this.cor = novaCor;
	}
	
	int quantasPortasEstaoAbertas(){
		int contador = 0;
		if(this.porta1.estaAberta() == true ){
			contador += 1;
		}
		if(this.porta2.estaAberta() == true){
			contador += 1;
		}
		if(this.porta3.estaAberta() == true){
			contador += 1;
		}
		return contador;
	}
}
