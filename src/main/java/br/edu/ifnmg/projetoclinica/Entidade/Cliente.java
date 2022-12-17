package br.edu.ifnmg.projetoclinica.Entidade;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Classe que representa um cliente da clínica.
 *
 * @author Projeto
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "cliente.loadAll",
            query = "select t from Cliente t "
    ),
    @NamedQuery(
            name = "cliente.findAll",
            query = "select distinct t from Cliente t "
    ),
    @NamedQuery(
            name = "cliente.findById",
            query = "select t from Cliente t "
            + "where t.id = :id"
    )
})
public class Cliente extends Pessoa {

    @OneToMany
    private List<Consulta> consultas;
    @ManyToMany
    @JoinTable(name = "cliente_convenio",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "convenio_id"))
    private List<Convenio> convenio;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente() {
    }

    public Cliente(List<Consulta> consultas, List<Convenio> convenio) {
        this.consultas = consultas;
        this.convenio = convenio;
    }

    public Cliente(List<Consulta> consultas, List<Convenio> convenio, Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
        super(cpf, nome, nascimento, endereco);
        this.consultas = consultas;
        this.convenio = convenio;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Convenio> getConvenio() {
        return convenio;
    }

    public void setConvenio(List<Convenio> convenio) {
        this.convenio = convenio;
    }
//</editor-fold>
}
