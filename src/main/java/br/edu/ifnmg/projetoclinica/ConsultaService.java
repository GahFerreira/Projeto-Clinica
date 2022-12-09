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
@Named(value = "consultaBean")
@RequestScoped
public class ConsultaBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    @Resource
    private UserTransaction userTransaction;
    private Consulta consulta;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public ConsultaBean() {
        consulta = new Consulta();
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Misc">
    public void save() throws Exception{
        userTransaction.begin();
        manager.persist(consulta);
        userTransaction.commit();
    }
    public Consulta find(Long ID) throws Exception{
        userTransaction.begin();
        Consulta ret = manager.find(Consulta.class, ID);
        userTransaction.commit();
        return ret;
    }
    public void remove(Long ID) throws Exception{
        Consulta rem = find(ID);
        userTransaction.begin();
        manager.remove(manager.contains(rem) ? rem : manager.merge(rem));
        userTransaction.commit();
    }
    public void update(Long ID) throws Exception{
        Consulta updt = find(ID);
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome");
        userTransaction.begin();
        manager.merge(updt);
        userTransaction.commit();
    }
    //</editor-fold>
}
