package util;

import interfaces.AreaCalculavel;

public class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;
	
	public Retangulo(int altura, int largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calculaArea(){
		return this.largura * this.altura;
	}
}
