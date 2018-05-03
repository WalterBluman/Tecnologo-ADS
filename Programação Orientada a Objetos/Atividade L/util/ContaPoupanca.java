package util;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	@Override
	public String toString() {
		String msg = "Nome do cliente: " + getNome() + " |  N�mero: " + getNumero() + " |  Saldo: " + getSaldo() + "\n";
		return msg;
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}

	// 9� Questao
	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNome().compareTo(o.getNome());
	}

	
	/* 2� Quest�o
	@Override
	public int compareTo(ContaPoupanca o) {
		if (this.numero < o.numero){
			return -1;
		}
		if (this.numero > o.numero){
			return 1;
		}
		return 0;
	}*/

}
