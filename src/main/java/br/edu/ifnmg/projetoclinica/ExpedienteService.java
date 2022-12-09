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
public class ExpedienteService implements ExpedienteServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Expediente expediente) throws Exception{
        manager.persist(expediente);
    }
    @Override
    public Expediente find(Long ID) throws Exception{
        Expediente ret = manager.find(Expediente.class, ID);
        return ret;
    }
    @Override
    public void remove(Expediente rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Expediente updt) throws Exception{
        manager.merge(updt);
    }
}
