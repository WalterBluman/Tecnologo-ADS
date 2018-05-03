package util;

public class Conta {
	protected String nome;
	protected double numero;
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(numero) != Double.doubleToLongBits(other.numero))
			return false;
		return true;
	}
	
	
}
