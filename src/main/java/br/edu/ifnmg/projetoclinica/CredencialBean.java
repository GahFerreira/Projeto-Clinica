package br.edu.ifnmg.projetoclinica;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author Projeto
 */
@Named(value = "credencialBean")
@RequestScoped
public class CredencialBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    @Resource
    private UserTransaction userTransaction;
    private Credencial credencial;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public CredencialBean() {
        credencial=new Credencial();
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Credencial getCredencial() {
        return credencial;
    }
    public void setCredencial(Credencial credencial) {
        this.credencial=credencial;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Misc">
    public void save() throws Exception{
        userTransaction.begin();
        manager.persist(credencial);
        userTransaction.commit();
    }
    public Credencial find(Long ID) throws Exception{
        userTransaction.begin();
        Credencial ret = manager.find(Credencial.class, ID);
        userTransaction.commit();
        return ret;
    }
    public void remove(Long ID) throws Exception{
        Credencial rem = find(ID);
        userTransaction.begin();
        manager.remove(rem);
        userTransaction.commit();
    }
    public void update(Long ID) throws Exception{
        Credencial updt = find(ID);
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome");
        userTransaction.begin();
        manager.merge(updt);
        userTransaction.commit();
    }
//</editor-fold>
}
