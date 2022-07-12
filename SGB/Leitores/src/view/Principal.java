package view;

import controller.LeitoresDAO;
import model.Leitores;

public class Principal {

	public static void main(String[] args) {
	
		LeitoresDAO leitorDAO = new LeitoresDAO();
		Leitores leitor = new Leitores();
		
		leitor.setId(1);
		leitor.setNome("Franklin");
		leitor.setEstado("Ceara");
		leitor.setEndereco("Rua Dom Jose, 426");
		leitor.setCidade("Fortaleza");
		
		leitorDAO.salvar(leitor);
		leitorDAO.listarLeitores();

	}

}
