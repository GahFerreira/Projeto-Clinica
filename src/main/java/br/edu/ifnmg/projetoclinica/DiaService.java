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
public class DiaService implements DiaServiceLocal {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Dia dia) throws Exception{
        manager.persist(dia);
    }
    @Override
    public Dia find(Long ID) throws Exception{
        Dia ret = manager.find(Dia.class, ID);
        return ret;
    }
    @Override
    public void remove(Dia rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Dia updt) throws Exception{
        manager.merge(updt);
    }
}
