package app;

import interfaces.AreaCalculavel;
import util.Retangulo;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(2, 3);
		System.out.println(a.calculaArea());
	}
}
