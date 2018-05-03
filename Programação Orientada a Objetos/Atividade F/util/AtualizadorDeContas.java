package util;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo: " + c.getSaldo() + "\nSelic: " + this.selic);
		c.atualiza(0.01);
		System.out.println("Saldo Final: " + c.getSaldo());
		saldoTotal += c.getSaldo();

	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
}
