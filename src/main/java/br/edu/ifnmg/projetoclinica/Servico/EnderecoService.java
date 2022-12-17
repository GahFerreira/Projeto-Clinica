package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Endereco;
import java.util.List;
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
    
    public void save(Endereco endereco){
        manager.persist(endereco);
    }
    public Endereco find(Long ID){
        return manager
                .createNamedQuery(
                        "endereco.findById",
                        Endereco.class)
                .setParameter("id", ID)
                .getSingleResult();
    }
    public void remove(Endereco rem){
        manager.remove(rem);
    }
    public void update(Endereco updt){
        manager.merge(updt);
    }
}
