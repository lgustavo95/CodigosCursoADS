package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ap2dsw2023");

	public static EntityManager fabricaEntityManager() {
		return emf.createEntityManager();
	}

}
