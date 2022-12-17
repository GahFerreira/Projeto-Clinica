package br.edu.ifnmg.projetoclinica.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Projeto
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "credencial.loadAll",
            query = "select t from Credencial t "
    ),
    @NamedQuery(
            name = "credencial.findAll",
            query = "select distinct t from Credencial t "
    ),
    @NamedQuery(
            name = "credencial.findById",
            query = "select t from Credencial t "
            + "where t.id = :id"
    )
})
public class Credencial extends Entidade {

    @Column(nullable = false, length = 121)
    private String nomeUsuario;
    @Column(nullable = false, length = 6)
    private String senha;
    @Column(nullable = false)
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

    @Override
    public String toString() {
        return "Credencial{"
                + ", nomeUsuario=" + nomeUsuario
                + ", senha=" + senha
                + ", administrador=" + administrador
                + '}';
    }
}
