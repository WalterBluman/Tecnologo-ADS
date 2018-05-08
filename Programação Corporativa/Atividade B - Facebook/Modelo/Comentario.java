package Modelo;

public class Comentario {
	private String conteudo;
	private String data;
	private Comentario respostas[];
	private Curtida curtidas[];
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Comentario[] getRespostas() {
		return respostas;
	}
	public void setRespostas(Comentario[] respostas) {
		this.respostas = respostas;
	}
	public Curtida[] getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(Curtida curtidas[]) {
		this.curtidas = curtidas;
	}
	
}
