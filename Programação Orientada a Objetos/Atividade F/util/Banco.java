package util;

public class Banco {
	Conta[] contas = new Conta[5];
	
	public void adiciona(Conta c) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
			}
		}
	}
	
	public Conta pegaConta(int x){
		return contas[x];
	}
	
	public int pegaTotalDeContas() {
		int cont = 0; 
		for (int i = 0; i < contas.length; i++) {
			cont += 1;
		}
		return cont;
	}
	
	public void imprime(){
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Numero da conta: " + contas[i].getNumero() + " ------------ Saldo: " + contas[i].getSaldo());
		}
		System.out.println("--------------------------------------------");
	}
}
