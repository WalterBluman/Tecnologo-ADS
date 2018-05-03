package app;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Random;

import util.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
		
		//List<ContaPoupanca> contas = new LinkedList<>(); //05º questao
		List<ContaPoupanca> contas = new ArrayList<>();
	
		ContaPoupanca c1 = new ContaPoupanca();
		ContaPoupanca c2 = new ContaPoupanca();
		ContaPoupanca c3 = new ContaPoupanca();
		
		c1.setNumero(1973);
		c1.setNome("Ana Cecília");
		contas.add(c1);
		
		 
		c2.setNumero(1462); 
		c2.setNome("José da Silva");
		contas.add(c2);
		
		c3.setNumero(1854);
		c3.setNome("Zilda Maria");
		contas.add(c3);
		
		Collections.sort(contas);
		
		/* 6º Questão - Respectivamente: inverte, embaralha e rotaciona
		Collections.reverse(contas);
		Collections.shuffle(contas);
		Collections.rotate(contas, 1);
		*/
		
		/* 7º Questão
		for (int i = 0; i < contas.size(); i++) {
			ContaPoupanca atual = new ContaPoupanca();
			Random aux = new Random();
			int numero = aux.nextInt(1000);
			atual.setNumero(numero);
			double saldo = aux.nextDouble();
			atual.setSaldo(saldo);
			contas.add(atual);
			
		}
		*/
		
		//System.out.println(contas); //8º Questão
		
		
		for (int i = 0; i < contas.size() ; i++) {
			Conta atual = contas.get(i);
			System.out.println("Nome do cliente: " + atual.getNome() + " |  Número: " + atual.getNumero() + " |  Saldo: " + atual.getSaldo() + "\n");
		}
	}
}

