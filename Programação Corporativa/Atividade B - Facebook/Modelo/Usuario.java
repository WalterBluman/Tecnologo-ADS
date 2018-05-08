package Modelo;

public class Usuario {
	private String nome;
	private String email;
	private String sexo;
	private String nascimento;
	private String dataCadastro;
	private Pagina paginas[];
	private Usuario amigos[];
	private Usuario seguidores[];
	private Grupo grupos[];
	private Postagem timeLine[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Pagina[] getPaginas() {
		return paginas;
	}
	public void setPaginas(Pagina paginas[]) {
		this.paginas = paginas;
	}
	public Usuario[] getAmigos() {
		return amigos;
	}
	public void setAmigos(Usuario amigos[]) {
		this.amigos = amigos;
	}
	public Usuario[] getSeguidores() {
		return seguidores;
	}
	public void setSeguidores(Usuario seguidores[]) {
		this.seguidores = seguidores;
	}
	public Grupo[] getGrupos() {
		return grupos;
	}
	public void setGrupos(Grupo grupos[]) {
		this.grupos = grupos;
	}
	public Postagem[] getTimeLine() {
		return timeLine;
	}
	public void setTimeLine(Postagem timeLine[]) {
		this.timeLine = timeLine;
	}
	
}
