package br.edu.unidep.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/* Nessa classe ser� realizada a cria��o da comunica��o com o BD (F�brica de conex�o). */
public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Biblioteca");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}