package controller;

import java.util.List;
import model.ReservarLivro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;

public class ReservarLivroDAO {

	EntityManagerFactory emf; //Chamadas do Banco de Dados
	EntityManager em; //Realizar as Transa��es
	
	//Construtor Padr�o
	public LeitoresDAO(){
		emf = Persistence.createEntityManagerFactory("ReservarLivro");
		em = emf.createEntityManager();
	}
	
	//CRUD
	public void salvar(ReservarLivro reserva ){
		try {
			em.getTransaction().begin();
			em.persist(reserva); 
			em.getTransaction().commit();
		} catch (HibernateException e) {
			em.getTransaction().rollback();
			System.out.println("N�o foi poss�vel inserir o Leitor. Erro: "+ e.getMessage());
		}
		finally {
			emf.close();	
		}
	
	}
	
	@SuppressWarnings("unchecked")
	public List<ReservaLivro> listarReservas(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select leitor from ReservaLivro reserva");
		List<ReservaLivro> reserva = consulta.getResultList() ;
		em.getTransaction().commit();
		emf.close();
		return reserva;
	}
}
