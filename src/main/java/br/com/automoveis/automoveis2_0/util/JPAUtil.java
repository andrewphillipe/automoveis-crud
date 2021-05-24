package br.com.automoveis.automoveis2_0.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("Automoveis");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
