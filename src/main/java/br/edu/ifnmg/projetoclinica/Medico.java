package br.edu.ifnmg.projetoclinica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Projeto
 */
@Entity
public class Medico extends Pessoa {
    private String crm;
    private Double tempoConsulta;
    @OneToOne
    private Expediente expediente;
    @OneToMany
    private List<Consulta> consultas;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Medico() {
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas) {
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
        super(cpf, nome, nascimento, endereco);
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
    }

    public Medico(String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Long cpf, String nome, LocalDate nascimento, Endereco endereco, Long id) {
        super(cpf, nome, nascimento, endereco, id);
        this.crm = crm;
        this.tempoConsulta = tempoConsulta;
        this.expediente = expediente;
        this.consultas = consultas;
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
//</editor-fold>
}