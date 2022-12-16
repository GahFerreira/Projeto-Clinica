/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica;

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
    
    public void save(Medico medico) throws Exception{
        manager.persist(medico);
    }
    public Medico find(Long ID) throws Exception{
        Medico ret = manager.find(Medico.class, ID);
        return ret;
    }
    public void remove(Medico rem) throws Exception{
        manager.remove(rem);
    }
    public void update(Medico updt) throws Exception{
        manager.merge(updt);
    }
}
