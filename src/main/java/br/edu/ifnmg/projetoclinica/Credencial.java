package br.edu.ifnmg.projetoclinica;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Projeto
 */
@Entity
public class Credencial extends Entidade {

    @Column(nullable=false, length=121)
    private String nomeUsuario;
    @Column(nullable=false, length=6)
    private String senha;
    @Column(nullable=false)
    private String grupo;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Credencial() {
    }
    
    public Credencial(String nomeUsuario, String senha, String grupo) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.grupo = grupo;
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
    
    public String getGrupo() {
        return grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
//</editor-fold>
    @Override
    public String toString() {
        return "Credencial{"
                + ", nomeUsuario=" + nomeUsuario
                + ", senha=" + senha
                + ", grupo=" + grupo
                + '}';
    }
}
