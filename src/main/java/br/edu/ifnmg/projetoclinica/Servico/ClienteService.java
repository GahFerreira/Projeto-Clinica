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
public class ClienteService implements ClienteServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Cliente cliente) throws Exception{
        manager.persist(cliente);
    }
    @Override
    public Cliente find(Long ID) throws Exception{
        Cliente ret = manager.find(Cliente.class, ID);
        return ret;
    }
    @Override
    public void remove(Cliente rem) throws Exception{
        //manager.remove(manager.contains(rem) ? rem : manager.merge(rem)); //antigo
        manager.remove(rem);
    }
    @Override
    public void update(Cliente updt) throws Exception{
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome") e chama esse update;
        manager.merge(updt);
    }
}
