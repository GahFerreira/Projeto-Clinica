package br.edu.ifnmg.projetoclinica;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class CredencialService implements CredencialServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Credencial credencial) throws Exception{
        manager.persist(credencial);
    }
    @Override
    public Credencial find(Long ID) throws Exception{
        Credencial ret = manager.find(Credencial.class, ID);
        return ret;
    }
    @Override
    public void remove(Credencial rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Credencial updt) throws Exception{
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
