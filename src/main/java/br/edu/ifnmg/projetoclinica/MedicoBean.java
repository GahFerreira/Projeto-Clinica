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
@Named(value = "medicoBean")
@RequestScoped
public class MedicoBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    @Resource
    private UserTransaction userTransaction;
    private Medico medico;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public MedicoBean() {
        medico = new Medico();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Misc">
    public void save() throws Exception{
        userTransaction.begin();
        manager.persist(medico);
        userTransaction.commit();
    }
    public Medico find(Long ID) throws Exception{
        userTransaction.begin();
        Medico ret = manager.find(Medico.class, ID);
        userTransaction.commit();
        return ret;
    }
    public void remove(Long ID) throws Exception{
        Medico rem = find(ID);
        userTransaction.begin();
        manager.remove(manager.contains(rem) ? rem : manager.merge(rem));
        userTransaction.commit();
    }
    public void update(Long ID) throws Exception{
        Medico updt = find(ID);
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome");
        userTransaction.begin();
        manager.merge(updt);
        userTransaction.commit();
    }
    //</editor-fold>
}
