package controller;

import java.util.List;
import model.Leitores;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;

public class LeitoresDAO {

	EntityManagerFactory emf; //Chamadas do Banco de Dados
	EntityManager em; //Realizar as Transa��es
	
	//Construtor Padr�o
	public LeitoresDAO(){
		emf = Persistence.createEntityManagerFactory("Leitores");
		em = emf.createEntityManager();
	}
	
	//CRUD
	public void salvar(Leitores leitor ){
		try {
			em.getTransaction().begin();
			em.persist(leitor); 
			em.getTransaction().commit();
		} catch (HibernateException e) {
			em.getTransaction().rollback();
			System.out.println("N�o foi poss�vel inserir o Leitor. Erro: "+ e.getMessage());
		}
		finally {
			emf.close();	
		}	
	}
	
	public void alterar(Leitores leitor ){
		try {
			em.getTransaction().begin();
			em.merge(leitor); 
			em.getTransaction().commit();
		} catch (HibernateException e) {
			em.getTransaction().rollback();
			System.out.println("N�o foi poss�vel Alterar o Leitor. Erro: "+ e.getMessage());
		}
		finally {
			emf.close();	
		}
	
	}
	public void remover(Leitores leitor){
		try {
			em.getTransaction().begin();
			em.remove(leitor);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("N�o foi poss�vel Excluir o Leitor. Erro: "+ e.getMessage());
			
		}finally {
			emf.close();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Leitores> listarLeitores(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select leitor from Leitores leitor");
		List<Leitores> leitores = consulta.getResultList() ;
		em.getTransaction().commit();
		emf.close();
		return leitores;
	}
}
