package controller;

import java.util.List;
import model.DevolverLivro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class DevolverLivroDAO {
	
	EntityManagerFactory emf; //Chamadas do Banco de Dados
	EntityManager em; //Realizar as Transa��es

	public DevolverLivroDAO(){
		
		emf = Persistence.createEntityManagerFactory("DevolverLivro");
		em = emf.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<DevolverLivro> listarDevolucao(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select Devolverlivro from emprestimo emprestimo");
		List<DevolverLivro> devolucoes = consulta.getResultList() ;
		em.getTransaction().commit();
		emf.close();
		return devolucoes;
	}
}
