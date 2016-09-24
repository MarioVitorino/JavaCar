package ClassesBásicas;
import java.util.Date;

public class OrdemServico {
	
	private long numeroServico;
	private Date horarioEntrada;
	private String estadoAtual;
	private Date previsao;
	
	public long getNumeroServico() {
		return numeroServico;
	}
	public void setNumeroServico(long numeroServico) {
		this.numeroServico = numeroServico;
	}
	public Date getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(Date horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public String getEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	public Date getPrevisao() {
		return previsao;
	}
	public void setPrevisao(Date previsao) {
		this.previsao = previsao;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numeroServico ^ (numeroServico >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		if (numeroServico != other.numeroServico)
			return false;
		return true;
	}
	
}
