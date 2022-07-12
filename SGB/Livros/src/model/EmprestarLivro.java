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
@Table(name = "emprestarLivro")
public class EmprestarLivro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar dataEmprestimo;
	@Column
	private Calendar dataDevolucao;
	
	@Column
	private String idLeitor;
	@Column
	private String idFuncionario;
	@Column
	private String codLivro;
	
	public EmprestarLivro(long id, Calendar dataEmprestimo, Calendar dataDevolucao, String idLeitor, String idFuncionario,
			String codLivro) {
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.idLeitor = idLeitor;
		this.idFuncionario = idFuncionario;
		this.codLivro = codLivro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
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

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCodLivro() {
		return codLivro;
	}

	public void setCodLivro(String codLivro) {
		this.codLivro = codLivro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLivro == null) ? 0 : codLivro.hashCode());
		result = prime * result + ((dataDevolucao == null) ? 0 : dataDevolucao.hashCode());
		result = prime * result + ((dataEmprestimo == null) ? 0 : dataEmprestimo.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		EmprestarLivro other = (EmprestarLivro) obj;
		if (codLivro == null) {
			if (other.codLivro != null)
				return false;
		} else if (!codLivro.equals(other.codLivro))
			return false;
		if (dataDevolucao == null) {
			if (other.dataDevolucao != null)
				return false;
		} else if (!dataDevolucao.equals(other.dataDevolucao))
			return false;
		if (dataEmprestimo == null) {
			if (other.dataEmprestimo != null)
				return false;
		} else if (!dataEmprestimo.equals(other.dataEmprestimo))
			return false;
		if (id != other.id)
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
		return "EmprestarLivro [id=" + id + ", dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao
				+ ", idLeitor=" + idLeitor + ", idFuncionario=" + idFuncionario + ", codLivro=" + codLivro + "]";
	}
	
}
