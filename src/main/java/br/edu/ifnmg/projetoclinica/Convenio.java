package br.edu.ifnmg.projetoclinica;

import javax.persistence.Entity;

/**
 * Classe que representa um cliente da clínica.
 * 
 * @author Saulo
 */
@Entity
public class Convenio extends Entidade{
    private String nome;
    private Double desconto;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Convenio() {
    }
    
    public Convenio(String nome, Double desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
        public Double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
//</editor-fold>
}
