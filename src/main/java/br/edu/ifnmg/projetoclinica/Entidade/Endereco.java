package br.edu.ifnmg.projetoclinica.Entidade;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Classe que representa um endereço.
 * 
 * @author Projeto
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "endereco.loadAll",
            query = "select t from Endereco t "
    ),
    @NamedQuery(
            name = "endereco.findAll",
            query = "select distinct t from Endereco t "
    ),
    @NamedQuery(
            name = "endereco.findById",
            query = "select t from Endereco t "
            + "where t.id = :id"
    )
})
public class Endereco extends Entidade {
    private Integer numero;
    private String rua;
    private String bairro;
    private String cidade;
    private Integer cep;
    private enum Estado{AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SE, TO}
    private Estado estado;//na dúvida se precisaria de usar @Enumerated e manter no banco

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Endereco() {
    }
    
    public Endereco(Integer numero, String rua, String bairro, String cidade, Integer cep, Estado estado) {
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
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
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
//</editor-fold>
}
