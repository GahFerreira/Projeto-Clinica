package br.edu.ifnmg.projetoclinica.Entidade;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Projeto
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "medico.loadAll",
            query = "select t from Medico t "
    ),
    @NamedQuery(
            name = "medico.findAll",
            query = "select distinct t from Medico t "
    ),
    @NamedQuery(
            name = "medico.findById",
            query = "select t from Medico t "
            + "where t.id = :id"
    )
})
public class Medico extends Pessoa {

    private String crm;
    private Double tempoConsulta;

    public enum Especialidade {
        Dentista, Oftamologista, Pneumologista, Otarrinolaringologista
    }
    private Especialidade especialidade;
    @OneToOne
    private Expediente expediente;
    @OneToMany
    private List<Consulta> consultas;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Medico() {
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Especialidade especialidade) {
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
        this.especialidade = especialidade;
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Especialidade especialidade, Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
        super(cpf, nome, nascimento, endereco);
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
        this.especialidade = especialidade;
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Especialidade especialidade, Long cpf, String nome, LocalDate nascimento, Endereco endereco, Long id) {
        super(cpf, nome, nascimento, endereco, id);
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
        this.especialidade = especialidade;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Double getTempoConsulta() {
        return tempoConsulta;
    }

    public void setTempoConsulta(Double tempoConsulta) {
        this.tempoConsulta = tempoConsulta;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
//</editor-fold>
}
