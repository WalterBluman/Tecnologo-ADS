package util;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	Map<String, Conta> contas = new HashMap<>();
	
	public void adiciona(String nome, Conta c){
		contas.put(nome, c);
	}
	
	public Conta pega (int x){
		Conta atual = contas.get(x);
		return atual;		
	}
	
	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
	
	public void buscaPorNome(String nome){
		contas.get(nome);
			
	}
	
	
	
}
