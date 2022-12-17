package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Credencial;
import java.util.List;
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
    public void save(Credencial credencial){
        manager.persist(credencial);
    }
    @Override
    public List<Credencial> find(Long ID){
        return manager
                .createNamedQuery(
                        "credencial.findById",
                        Credencial.class)
                .setParameter("id", ID)
                .getResultList();
    }
    @Override
    public void remove(Credencial rem){
        manager.remove(rem);
    }
    @Override
    public void update(Credencial updt){
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
