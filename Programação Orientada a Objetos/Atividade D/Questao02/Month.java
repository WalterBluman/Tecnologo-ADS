package Questao02;

import java.util.Random;

public class Month {

	public static void main(String[] args) {
		
		String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		Random index = new Random();
		int i = index.nextInt(11);
		
		System.out.println("Mês sorteado: " + months[i]);
		
	}
}
