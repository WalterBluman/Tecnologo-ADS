package transporteAereo;

public class Aeroporto {
	private String nome;
	private String endereco;
	private Cidade cidade;
	
	public Aeroporto(String nome, Cidade cidade) {
		this.setNome(nome);
		this.setCidade(cidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
