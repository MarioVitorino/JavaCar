package ClassesBásicas;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endereço;
	private String telefone;
	private String email;
	
	Pessoa(){
		this.nome = null;
		this.cpf = null;
		this.endereço = null;
		this.telefone= null;
		this.email = null;
	}
	Pessoa(String nome, String cpf, String endereço, String telefone, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
