package transporteAereo;

public class Voo {
	private String numero;
	private Escala destino;
	private Aviao aviao;
	private Passageiro passageiro;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Escala getDestino() {
		return destino;
	}
	public void setDestino(Escala destino) {
		this.destino = destino;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public Aviao getAviao() {
		return aviao;
	}
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	
	
	
}
