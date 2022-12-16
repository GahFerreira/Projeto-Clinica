package br.edu.ifnmg.projetoclinica;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thiago Riquelmo
 */
@Stateless
public class EnderecoService implements EnderecoServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    public void save(Endereco endereco) throws Exception{
        manager.persist(endereco);
    }
    public Endereco find(Long ID) throws Exception{
        Endereco ret = manager.find(Endereco.class, ID);
        return ret;
    }
    public void remove(Endereco rem) throws Exception{
        manager.remove(rem);
    }
    public void update(Endereco updt) throws Exception{
        manager.merge(updt);
    }
}
