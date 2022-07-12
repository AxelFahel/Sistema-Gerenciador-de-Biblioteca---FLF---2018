package controller;

import java.util.List;
import model.Livro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class LivroDAO {
	
	EntityManagerFactory emf; //Chamadas do Banco de Dados
	EntityManager em; //Realizar as Transações

	public LivroDAO(){
		
		emf = Persistence.createEntityManagerFactory("Leitores");
		em = emf.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Livro> listarLeitores(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select livro from Livro livro");
		List<Livro> leitores = consulta.getResultList() ;
		em.getTransaction().commit();
		emf.close();
		return leitores;
	}
}
