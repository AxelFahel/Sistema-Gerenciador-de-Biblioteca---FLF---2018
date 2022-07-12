package controller;

import java.util.List;
import model.EmprestarLivro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;


public class EmprestarLivroDAO {
	
	EntityManagerFactory emf; //Chamadas do Banco de Dados
	EntityManager em; //Realizar as Transa��es

	public EmprestarLivroDAO(){
		
		emf = Persistence.createEntityManagerFactory("EmprestarLivro");
		em = emf.createEntityManager();
	}
	
	//CRUD
		public void salvar(EmprestarLivro emprestimo ){
			try {
				em.getTransaction().begin();
				em.persist(emprestimo); 
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
	public List<EmprestimoLivros> listarEmprestimoLivros(){
		
		em.getTransaction().begin();
		Query consulta = em.createQuery("select EmprestimoLivros from  emprestimo");
		List<emprestimoLivros> emprestimo = consulta.getResultList() ;
		em.getTransaction().commit();
		emf.close();
		return emprestimo;
	}
}
