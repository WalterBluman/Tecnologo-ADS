package app;

import util.AtualizadorDeContas;
import util.Banco;
import util.Conta;
import util.ContaCorrente;
import util.ContaPoupanca;

public class TesteBanco {
	public static void main(String[] args) {
		Banco b = new Banco();
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(10);
		cc.deposita(200);
		cp.deposita(3000);
		
		b.adiciona(c);
		b.adiciona(cc);
		b.adiciona(cp);
		
		AtualizadorDeContas atualiza = new AtualizadorDeContas(0.01);
		
		for (int i = 0; i < b.pegaTotalDeContas(); i++) {
			atualiza.roda(b.pegaConta(i));
		}
	}
}
