package ClassesB�sicas;

public class Cliente {

	private long codigo;
	private Pessoa dados;
	
	Cliente(long codigo,String nome, String cpf, String endere�o, String telefone, String email){
		
		this.codigo = codigo;
		dados = new Pessoa(nome, cpf, endere�o, telefone, email);
	}
	
	Cliente(Pessoa dados, long codigo){
		this.dados = dados;
		this.codigo = codigo;
	}
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDadosNome() {
		return dados.getNome();
	}
	
	public String getDadosEndere�o(){
		return dados.getEndere�o();
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
	
	public void setDadosNomeCpfEndere�oTelefoneEmail(String nome, String cpf, String endere�o, String telefone, String email) {
		this.dados.setNome(nome);
		this.dados.setCpf(cpf);
		this.dados.setEndere�o(endere�o);
		this.dados.setTelefone(telefone);
		this.dados.setEmail(email);
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	public String toString(){
		return "Dados do cliente\n\n" + "Codigo: " + this.getCodigo() + "\nNome: "+this.getDadosNome() + "\n"+
	"Cpf: "+ this.getDadosCPf() + "\nEndere�o: "+ this.getDadosEndere�o() + "\nTelefone: "+ this.getDadosTelefone() + "\n"+
				"Email: " + this.getDadosEmail();
	}
	
}
