package br.edu.ifnmg.projetoclinica;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Projeto
 */
@Named(value = "credencialBean")
@RequestScoped
public class CredencialBean {
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
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
    public String save() throws Exception{
        manager.persist(credencial);
        System.out.println("> "+credencial);
        return "saida";
    }
//</editor-fold>
}
