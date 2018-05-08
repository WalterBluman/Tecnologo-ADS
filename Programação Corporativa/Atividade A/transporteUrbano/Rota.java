package transporteUrbano;

public class Rota {
	private Paradas paradaInicial;
	private Paradas paradaRetorno;
	private Paradas[] paradas;

	
	public Paradas getParadaInicial() {
		return paradaInicial;
	}

	public void setParadaInicial(Paradas paradaInicial) {
		this.paradaInicial = paradaInicial;
	}

	public Paradas getParadaRetorno() {
		return paradaRetorno;
	}

	public void setParadaRetorno(Paradas paradaRetorno) {
		this.paradaRetorno = paradaRetorno;
	}

	public Paradas[] getParadas() {
		return paradas;
	}

	public void setParadas(Paradas[] paradas) {
		this.paradas = paradas;
	}
}
