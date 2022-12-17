/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Expediente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class ExpedienteService implements ExpedienteServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Expediente expediente){
        manager.persist(expediente);
    }
    @Override
    public Expediente find(Long ID){
        return manager
                .createNamedQuery(
                        "expediente.findById",
                        Expediente.class)
                .setParameter("id", ID)
                .getSingleResult();
    }
    @Override
    public void remove(Expediente rem){
        manager.remove(rem);
    }
    @Override
    public void update(Expediente updt){
        manager.merge(updt);
    }
}
