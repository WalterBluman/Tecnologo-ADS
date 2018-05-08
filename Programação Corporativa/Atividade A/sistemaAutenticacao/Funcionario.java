package sistemaAutenticacao;

public class Funcionario {
	private String nome;
	private String CPF;
	private String telefone;
	private double salario;
	private Empresa empresa;
	private Permissoes permissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Permissoes getPermissao() {
		return permissao;
	}
	public void setPermissao(Permissoes permissao) {
		this.permissao = permissao;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
