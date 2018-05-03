package app;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionar {
	
	public static void main(String[] args) {
		System.out.println("INICIANDO...");
		long inicio = System.currentTimeMillis();
		
		//List<Integer> teste = new LinkedList<>();
		List<Integer> teste = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double total = (fim - inicio) / 1000.0;
		System.out.println("Tempo total:" + total);
	}
}
