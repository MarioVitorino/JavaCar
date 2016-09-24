package ClassesBásicas;

public class Servico {

	private long codigo;
	private String nome;
	private double valor;
	
	Servico(long codigo, String nome, double valor){
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
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
		Servico other = (Servico) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	public String toString(){
		return "Dados do serviço\n\n" + "Codigo: " + this.getCodigo() + "\nNome: " + this.getNome() + "\n" +
	"Valor: " + this.getValor();
	}
	
}
