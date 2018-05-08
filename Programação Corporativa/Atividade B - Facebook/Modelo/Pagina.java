package Modelo;

public class Pagina {
	private String titulo;
	private Curtida curtidas[];
	private Postagem postagens[];
	private Usuario seguidores[];

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Curtida[] getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Curtida curtidas[]) {
		this.curtidas = curtidas;
	}

	public Postagem[] getPostagens() {
		return postagens;
	}

	public void setPostagens(Postagem postagens[]) {
		this.postagens = postagens;
	}

	public Usuario[] getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Usuario seguidores[]) {
		this.seguidores = seguidores;
	}
	
}
