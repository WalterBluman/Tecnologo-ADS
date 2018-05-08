package Modelo;

public class Grupo {
	private String titulo;
	private Usuario membros[];
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Usuario[] getMembros() {
		return membros;
	}
	public void setMembros(Usuario membros[]) {
		this.membros = membros;
	}
	
}
