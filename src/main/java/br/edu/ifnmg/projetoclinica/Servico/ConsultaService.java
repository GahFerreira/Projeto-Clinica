/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Consulta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class ConsultaService implements ConsultaServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Consulta consulta){
        manager.persist(consulta);
    }
    @Override
    public List<Consulta> find(Long ID){
        return manager
                .createNamedQuery(
                        "consulta.findById",
                        Consulta.class)
                .setParameter("id", ID)
                .getResultList();
    }
    @Override
    public void remove(Consulta rem){
        manager.remove(rem);
    }
    @Override
    public void update(Consulta updt){
        manager.merge(updt);
    }
}
