package questao01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {
	public static void main(String[] args) throws IOException {
		String s;
		float valueProduct, percent, valueFinal;
		BufferedReader dado;
	
		System.out.println("Digite o valor do produto: ");
		dado = new BufferedReader (new InputStreamReader (System.in));
		s = dado.readLine();
		valueProduct = Float.parseFloat(s);
		
		System.out.println("Digite o percentual do desconto: ");
		dado = new BufferedReader (new InputStreamReader (System.in));
		s = dado.readLine();
		percent = Float.parseFloat(s);
		
		valueFinal = valueProduct - (valueProduct * percent / 100);
		
		System.out.println("Valor do desconto: " + valueProduct * percent / 100);
		System.out.println("Valor do produto com desconto: " + valueFinal);
			
			
	}
}
