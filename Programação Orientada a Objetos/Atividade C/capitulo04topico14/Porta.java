package capitulo04topico14;

public class Porta {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abrePorta(){
		aberta = true;
	}
	
	void fechaPorta(){
		aberta = false;
	}
	
	void pintaPorta(String coloracao){
		cor = coloracao;
	}
	
	public boolean estaAberta(){
		return aberta;
	}
	
	void aumentaDimensoes(double valor){
		this.dimensaoX += valor;
		this.dimensaoY += valor;
		this.dimensaoZ += valor;
	}
	
	void diminuiDimensoes(double valor){
		this.dimensaoX -= valor;
		this.dimensaoY -= valor;
		this.dimensaoZ -= valor;
	}
	
	void imprime(){
		if(aberta == true){
			System.out.println("Porta ABERTA!");
		}else{
			System.out.println("Porta FECHADA!");
		}
		System.out.println("Cor da porta: " + this.cor);
		System.out.println("---- Dimensões ----");
		
		System.out.println("X: " + this.dimensaoX + "\nY: " + this.dimensaoY + "\nZ: " + this.dimensaoZ);
		
	}
}
