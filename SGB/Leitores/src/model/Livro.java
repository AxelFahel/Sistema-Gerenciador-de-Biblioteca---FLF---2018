package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "Livro")
public class Livro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String ISBN;
	@Column
	private String titulo;
	@Column
	private String autor;
	@Column
	private String palavrasChaves;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataEdicao;
	
	@Column
	private boolean status;
	
	@Column
	private int numEdicao;
	@Column
	private String editora;
	@Column
	private long numPaginas;
	
	//FALTANDO FOTO
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPalavrasChaves() {
		return palavrasChaves;
	}
	public void setPalavrasChaves(String palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}
	public Date getDataEdicao() {
		return dataEdicao;
	}
	public void setDataEdicao(Date dataEdicao) {
		this.dataEdicao = dataEdicao;
	}
	public int getNumEdicao() {
		return numEdicao;
	}
	public void setNumEdicao(int numEdicao) {
		this.numEdicao = numEdicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public long getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(long numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}
