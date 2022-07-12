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
@Table(name = "DevolverLivro")
public class DevolverLivro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String codLivro;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar dataDevolucao;

	public DevolverLivro(long id, String codLivro, Calendar dataDevolucao) {
		this.id = id;
		this.codLivro = codLivro;
		this.dataDevolucao = dataDevolucao;
	}
	
	public DevolverLivro(){
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLivro == null) ? 0 : codLivro.hashCode());
		result = prime * result + ((dataDevolucao == null) ? 0 : dataDevolucao.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		DevolverLivro other = (DevolverLivro) obj;
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
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DevolverLivro [id=" + id + ", codLivro=" + codLivro + ", dataDevolucao=" + dataDevolucao + "]";
	}
	
	
}
