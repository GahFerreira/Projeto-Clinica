package br.edu.ifnmg.projetoclinica;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Classe que representa um cliente da clínica.
 * 
 * @author Projeto
 */
@Entity
public class Cliente extends Usuario {
    @OneToMany
    private List<Consulta> consultas;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente() {
    }
    
    public Cliente(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public Cliente(List<Consulta> consultas, Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
        super(cpf, nome, nascimento, endereco);
        this.consultas = consultas;
    }
    
    public Cliente(List<Consulta> consultas, Long cpf, String nome, LocalDate nascimento, Endereco endereco, Long id) {
        super(cpf, nome, nascimento, endereco, id);
        this.consultas = consultas;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Consulta> getConsultas() {
        return consultas;
    }
    
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
//</editor-fold>
}
