package app;

import java.util.Collection;
import java.util.HashSet;

import util.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Collection<Conta> contas = new HashSet<>();
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(200.00);
		c1.setNumero(2354);
		
		c2.deposita(300.00);
		c2.setNumero(2354);
		
		contas.add(c1);
		contas.add(c2);
		
	
		
	}
}
