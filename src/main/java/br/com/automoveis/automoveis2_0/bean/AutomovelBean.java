package br.com.automoveis.automoveis2_0.bean;

import br.com.automoveis.automoveis2_0.entities.Automovel;
import br.com.automoveis.automoveis2_0.util.JPAUtil;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ManagedBean
public class AutomovelBean {

    private List<Automovel> automoveis;

    public List<Automovel> getAutomoveis(){
        if(this.automoveis == null){
            EntityManager em = JPAUtil.getEntityManager();
            Query sql = em.createQuery("select a from Automovel a ", Automovel.class);

            this.automoveis = sql.getResultList();
            em.close();

        }

        return automoveis;
    }
}
