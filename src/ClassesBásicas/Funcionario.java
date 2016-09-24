package ClassesBásicas;

public class Funcionario {

	private long matricula;
	private String senha;
	private String cargo;
	private Pessoa dados;
	
	Funcionario(long matricula, String cargo, String nome, String cpf, String endereço, String telefone,
			String email, String senha){
		dados = new Pessoa(nome, cpf, endereço, telefone, email);
		this.matricula = matricula;
		this.cargo = cargo;
		this.senha = senha;
	}
	
	Funcionario(Pessoa dados, long matricula, String senha, String cargo){
		this.dados = dados;
		this.matricula = matricula;
		this.cargo = cargo;
		this.senha = senha;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Pessoa getDados() {
		return dados;
	}
	public void setDados(Pessoa dados) {
		this.dados = dados;
	}
	
	public String getDadosNome() {
		return dados.getNome();
	}
	
	public String getDadosEndereço(){
		return dados.getEndereço();
	}
	
	public String getDadosTelefone(){
		return dados.getTelefone();
	}
	
	public String getDadosCPf(){
		return dados.getCpf();
	}
	
	public String getDadosEmail(){
		return dados.getEmail();
	}
	
	public void setDadosNomeCpfEndereçoTelefoneEmail(String nome, String cpf, String endereço, String telefone, String email) {
		this.dados.setNome(nome);
		this.dados.setCpf(cpf);
		this.dados.setEndereço(endereço);
		this.dados.setTelefone(telefone);
		this.dados.setEmail(email);
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (matricula ^ (matricula >>> 32));
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (matricula != other.matricula)
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
	public String toString(){
		return "Dados Funcionario\n\n"+ "Matricula nº: " + this.getMatricula() + "\nCargo: " + this.getCargo() +
				"\nNome:  " + this.getDadosNome() + "\nCpf:  " + this.getDadosCPf();
	}
	
}
