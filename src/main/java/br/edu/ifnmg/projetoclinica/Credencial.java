package br.edu.ifnmg.projetoclinica;

import javax.persistence.Entity;

/**
 *
 * @author Projeto
 */
@Entity
public class Credencial extends Entidade {
    private String nomeUsuario;
    private String senha;
    private Boolean administrador;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Credencial() {
    }
    
    public Credencial(String nomeUsuario, String senha, Boolean admin) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.administrador = admin;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Boolean getAdministrador() {
        return administrador;
    }
    
    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }
//</editor-fold>
}
