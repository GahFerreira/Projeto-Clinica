/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author Thiago Riquelmo
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    @Resource
    private UserTransaction userTransaction;
    private Cliente cliente;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public ClienteBean() {
        cliente = new Cliente();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Cliente getMedico() {
        return cliente;
    }
    public void setConsulta(Cliente cliente) {
        this.cliente = cliente;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Misc">
    public void save() throws Exception{
        userTransaction.begin();
        manager.persist(cliente);
        userTransaction.commit();
    }
    public Cliente find(Long ID) throws Exception{
        userTransaction.begin();
        Cliente ret = manager.find(Cliente.class, ID);
        userTransaction.commit();
        return ret;
    }
    public void remove(Long ID) throws Exception{
        Cliente rem = find(ID);
        userTransaction.begin();
        manager.remove(rem);
        userTransaction.commit();
    }
    public void update(Long ID) throws Exception{
        Cliente updt = find(ID);
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome");
        userTransaction.begin();
        manager.merge(updt);
        userTransaction.commit();
    }
    //</editor-fold>
}
