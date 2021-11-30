package br.edu.unidep.bancoUtil;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unidep.util.JPAUtil;

public class Crud {


	public static void inserir(Object entity) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(entity);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	public static void alterar(Object entity) {

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(entity);
		
		em.getTransaction().commit();
		
		em.close();
	}
		
	public static void excluir(Class clazz, Integer id) {

		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();

		em.remove(em.getReference(clazz, id));
		
		em.getTransaction().commit();

		em.close();
	}
	
	public static Object buscar(Class clazz, int id) {
		EntityManager em = new JPAUtil().getEntityManager();
		return em.find(clazz, id);
	}
	
	public static List<Object> buscarTodos(Class clazz) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		List<Object> entity = new ArrayList<Object>();
		entity.addAll( em.createQuery("from "+clazz.getName()).getResultList() );
		return entity;
		
	}
}
