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
 * @author Saulo
 */
@Stateless
public class HorarioService implements HorarioServiceLocal {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Horario dia) throws Exception{
        manager.persist(dia);
    }
    @Override
    public Horario find(Long ID) throws Exception{
        Horario ret = manager.find(Horario.class, ID);
        return ret;
    }
    @Override
    public void remove(Horario rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Horario updt) throws Exception{
        manager.merge(updt);
    }
}
