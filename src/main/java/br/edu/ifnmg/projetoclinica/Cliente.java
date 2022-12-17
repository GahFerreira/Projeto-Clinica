package br.edu.ifnmg.projetoclinica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Classe que representa um cliente da clínica.
 * 
 * @author Projeto
 */
@Entity
public class Cliente extends Pessoa {
    @OneToMany
    private List<Consulta> consultas;
    @OneToOne
    private Convenio convenio;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente() {
    }
    
    public Cliente(List<Consulta> consultas, Convenio convenio) {
        this.consultas = consultas;
        this.convenio = convenio;
    }
    
    public Cliente(List<Consulta> consultas, Convenio convenio, Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
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
    public Convenio getConvenio() {
        return convenio;
    }
    
    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
//</editor-fold>
}
