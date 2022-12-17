/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Disponibilidade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class DisponibilidadeService implements DisponibilidadeServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Disponibilidade dia){
        manager.persist(dia);
    }
    @Override
    public List<Disponibilidade> find(Long ID){
        return manager
                .createNamedQuery(
                        "disponibilidade.findById",
                        Disponibilidade.class)
                .setParameter("id", ID)
                .getResultList();
    }
    @Override
    public void remove(Disponibilidade rem){
        manager.remove(rem);
    }
    @Override
    public void update(Disponibilidade updt){
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
