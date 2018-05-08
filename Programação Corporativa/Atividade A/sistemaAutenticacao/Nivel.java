package sistemaAutenticacao;

public class Nivel {
	private int codigo;
	private Permissoes[] permissoes;
	private Funcionario[] funcionarios;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Permissoes[] getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(Permissoes[] permissoes) {
		this.permissoes = permissoes;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}
