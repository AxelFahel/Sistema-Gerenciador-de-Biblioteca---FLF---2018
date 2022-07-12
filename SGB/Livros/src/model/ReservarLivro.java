package classes;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reservaLivro")
public class ReservarLivro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar dataCadastroReserva;
	@Column
	private Calendar dataDevolucao;
	@Column
	private String idLeitor;
	@Column
	private String codLivro;
	@Column
	private String idFuncionario;
	
	public ReservarLivro(Long id, Calendar dataCadastroReserva, Calendar dataDevolucao,
			String idLeitor, String codLivro, String idFuncionario) {
		this.id = id;
		this.dataCadastroReserva = dataCadastroReserva;
		this.dataDevolucao = dataDevolucao;
		this.idLeitor = idLeitor;
		this.codLivro = codLivro;
		this.idFuncionario = idFuncionario;
	}
	
	public ReservarLivro(){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Calendar getDataCadastroReserva() {
		return dataCadastroReserva;
	}
	public void setDataCadastroReserva(Calendar dataCadastroReserva) {
		this.dataCadastroReserva = dataCadastroReserva;
	}
	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getIdLeitor() {
		return idLeitor;
	}
	public void setIdLeitor(String idLeitor) {
		this.idLeitor = idLeitor;
	}
	public String getCodLivro() {
		return codLivro;
	}
	public void setCodLivro(String codLivro) {
		this.codLivro = codLivro;
	}
	public String getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLivro == null) ? 0 : codLivro.hashCode());
		result = prime * result + ((dataCadastroReserva == null) ? 0 : dataCadastroReserva.hashCode());
		result = prime * result + ((dataDevolucao == null) ? 0 : dataDevolucao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idFuncionario == null) ? 0 : idFuncionario.hashCode());
		result = prime * result + ((idLeitor == null) ? 0 : idLeitor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservarLivro other = (ReservarLivro) obj;
		if (codLivro == null) {
			if (other.codLivro != null)
				return false;
		} else if (!codLivro.equals(other.codLivro))
			return false;
		if (dataCadastroReserva == null) {
			if (other.dataCadastroReserva != null)
				return false;
		} else if (!dataCadastroReserva.equals(other.dataCadastroReserva))
			return false;
		if (dataDevolucao == null) {
			if (other.dataDevolucao != null)
				return false;
		} else if (!dataDevolucao.equals(other.dataDevolucao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idFuncionario == null) {
			if (other.idFuncionario != null)
				return false;
		} else if (!idFuncionario.equals(other.idFuncionario))
			return false;
		if (idLeitor == null) {
			if (other.idLeitor != null)
				return false;
		} else if (!idLeitor.equals(other.idLeitor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReservarLivro [id=" + id + ", dataCadastroReserva=" + dataCadastroReserva + ", dataDevolucao=" + dataDevolucao + ", idLeitor=" + idLeitor + ", codLivro=" + codLivro
				+ ", idFuncionario=" + idFuncionario + "]";
	}
}
