package br.edu.ifnmg.projetoclinica;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author Thiago Riquelmo
 */
@Named(value = "enderecoBean")
@RequestScoped
public class EnderecoBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    @Resource
    private UserTransaction userTransaction;
    private Endereco endereco;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public EnderecoBean() {
        endereco = new Endereco();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Misc">
    public void save() throws Exception{
        userTransaction.begin();
        manager.persist(endereco);
        userTransaction.commit();
    }
    public Endereco find(Long ID) throws Exception{
        userTransaction.begin();
        Endereco ret = manager.find(Endereco.class, ID);
        userTransaction.commit();
        return ret;
    }
    public void remove(Long ID) throws Exception{
        Endereco rem = find(ID);
        userTransaction.begin();
        manager.remove(manager.contains(rem) ? rem : manager.merge(rem));
        userTransaction.commit();
    }
    public void update(Long ID) throws Exception{
        Endereco updt = find(ID);
        //interface pra pegar a mudança
        //faz a mudança tipo updt.setNomeUsuario("Novo nome");
        userTransaction.begin();
        manager.merge(updt);
        userTransaction.commit();
    }
    //</editor-fold>
}
