package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entidade.Ensino;
import util.JPAutil;

public class EnsinoDao {

	public static void salvar(Ensino e) {
		EntityManager em = JPAutil.fabricaEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
	}

	public static List<Ensino> listar() {
		EntityManager em = JPAutil.fabricaEntityManager();
		Query q = em.createQuery("select e from Ensino e");
		List<Ensino> resultado = q.getResultList();
		em.close();
		return resultado;
	}

	public static void excluir(Ensino e) {
		EntityManager em = JPAutil.fabricaEntityManager();
		em.getTransaction().begin();
		e = em.find(Ensino.class, e.getId());
		em.remove(e);
		em.getTransaction().commit();
		em.close();
	}

}
