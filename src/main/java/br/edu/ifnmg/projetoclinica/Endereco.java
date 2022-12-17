package br.edu.ifnmg.projetoclinica;

import javax.persistence.Entity;

/**
 * Classe que representa um endereço.
 * 
 * @author Projeto
 */
@Entity
public class Endereco extends Entidade {
    private Integer numero;
    private String rua;
    private String bairro;
    private String cidade;
    private Integer cep;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Endereco() {
    }
    
    public Endereco(Integer numero, String rua, String bairro, String cidade, Integer cep) {
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public Integer getCep() {
        return cep;
    }
    
    public void setCep(Integer cep) {
        this.cep = cep;
    }
//</editor-fold>
}