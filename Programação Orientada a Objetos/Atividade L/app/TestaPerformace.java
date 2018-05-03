package app;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {
	public static void main(String[] args) {
		System.out.println("INICIANDO...");
		//Collection<Integer> teste = new ArrayList<>();
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		long inicioFor1 = System.currentTimeMillis();
		
		for (int i = 0; i < inicio; i++) {
			teste.add(i);
		}
		
		long fimFor1 = System.currentTimeMillis();
		
		long inicioFor2 = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) { 
			teste.contains(i); 
		}
		
		long fimFor2 = System.currentTimeMillis();
		
		System.out.println("Tempo de inserção: " + (inicioFor1 - fimFor1));
		System.out.println("Tempo de busca: " + (inicioFor2 - fimFor2));
		
		long fim = System.currentTimeMillis(); 
		long tempo = fim - inicio; 
		
		System.out.println("Tempo gasto: " + tempo);
	}
}