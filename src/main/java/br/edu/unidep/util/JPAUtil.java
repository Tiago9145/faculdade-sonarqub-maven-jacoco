package br.edu.unidep.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/* Nessa classe será realizada a criação da comunicação com o BD (Fábrica de conexão). */
public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}