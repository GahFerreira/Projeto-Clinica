/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Medico;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thiago Riquelmo
 */
@Stateless
public class MedicoService implements MedicoServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    public void save(Medico medico){
        manager.persist(medico);
    }
    public Medico find(Long ID){
        return manager
                .createNamedQuery(
                        "medico.findById",
                        Medico.class)
                .setParameter("id", ID)
                .getSingleResult();
    }
    public void remove(Medico rem){
        manager.remove(rem);
    }
    public void update(Medico updt){
        manager.merge(updt);
    }
}
