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
public class ConvenioService implements ConvenioServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Convenio convenio) throws Exception{
        manager.persist(convenio);
    }
    @Override
    public Convenio find(Long ID) throws Exception{
        Convenio ret = manager.find(Convenio.class, ID);
        return ret;
    }
    @Override
    public void remove(Convenio rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Convenio updt) throws Exception{
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
