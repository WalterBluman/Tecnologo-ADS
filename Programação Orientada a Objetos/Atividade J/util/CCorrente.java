package util;

import interfaces.ContaTributavel;
import interfaces.Tributavel;

public class CCorrente implements ContaTributavel {
	private double saldo;
	
	Conta c = new ContaCorrente();
	Tributavel t = new ContaCorrente();
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
		
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
	}
}
