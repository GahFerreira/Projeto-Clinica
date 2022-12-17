/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Convenio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class ConvenioService implements ConvenioServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Convenio convenio){
        manager.persist(convenio);
    }
    @Override
    public List<Convenio> find(Long ID){
        return manager
                .createNamedQuery(
                        "convenio.findById",
                        Convenio.class)
                .setParameter("id", ID)
                .getResultList();
    }
    @Override
    public void remove(Convenio rem){
        manager.remove(rem);
    }
    @Override
    public void update(Convenio updt){
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
