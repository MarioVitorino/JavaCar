package ClassesB�sicas;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endere�o;
	private String telefone;
	private String email;
	
	Pessoa(){
		this.nome = null;
		this.cpf = null;
		this.endere�o = null;
		this.telefone= null;
		this.email = null;
	}
	Pessoa(String nome, String cpf, String endere�o, String telefone, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
