/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Horario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class HorarioService implements HorarioServiceLocal {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Horario dia){
        manager.persist(dia);
    }
    @Override
    public List<Horario> find(Long ID){
        return manager
                .createNamedQuery(
                        "horario.findById",
                        Horario.class)
                .setParameter("id", ID)
                .getResultList();
    }
    @Override
    public void remove(Horario rem){
        manager.remove(rem);
    }
    @Override
    public void update(Horario updt){
        manager.merge(updt);
    }
}
