package br.com.automoveis.automoveis2_0.principal;

import br.com.automoveis.automoveis2_0.entities.Automovel;
import br.com.automoveis.automoveis2_0.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AutomoveisPrincipal {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        Automovel auto = new Automovel();
        auto.setMarca("Fiat");
        auto.setModelo("Uno");
        auto.setAnoFabricacao(2010);
        auto.setAnoModelo(2010);

        tx.begin();
        em.persist(auto);
        tx.commit();

        em.close();
    }

}

