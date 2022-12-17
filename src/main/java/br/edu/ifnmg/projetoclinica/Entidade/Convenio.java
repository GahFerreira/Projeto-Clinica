package br.edu.ifnmg.projetoclinica.Entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Classe que representa um cliente da clínica.
 * 
 * @author Saulo
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "convenio.loadAll",
            query = "select t from Convenio t "
    ),
    @NamedQuery(
            name = "convenio.findAll",
            query = "select distinct t from Convenio t "
    ),
    @NamedQuery(
            name = "convenio.findById",
            query = "select t from Convenio t "
            + "where t.id = :id"
    )
})
public class Convenio extends Entidade{
    private String nome;
    private Double desconto;
    @ManyToMany(mappedBy = "convenio")
    private List<Cliente> clientes;
    
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
