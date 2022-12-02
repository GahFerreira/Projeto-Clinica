package br.edu.ifnmg.projetoclinica;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Projeto
 */
@MappedSuperclass
public abstract class Entidade implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Entidade() {
    }
    
    
    public Entidade(Long id) {
        this.id = id;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
//</editor-fold>
}
