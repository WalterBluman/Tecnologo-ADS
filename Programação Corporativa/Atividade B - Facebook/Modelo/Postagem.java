package Modelo;

public class Postagem {
	private Usuario usuario;
	private String data;
	private Curtida curtidas[];
	private Comentario comentarios[];
	private Compartilhar compartilhamentos[];
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Curtida[] getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(Curtida[] curtidas) {
		this.curtidas = curtidas;
	}
	public Comentario[] getComentarios() {
		return comentarios;
	}
	public void setComentarios(Comentario comentarios[]) {
		this.comentarios = comentarios;
	}
	public Compartilhar[] getCompartilhamentos() {
		return compartilhamentos;
	}
	public void setCompartilhamentos(Compartilhar compartilhamentos[]) {
		this.compartilhamentos = compartilhamentos;
	}
}
