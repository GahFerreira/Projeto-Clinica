package br.edu.ifnmg.projetoclinica;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Projeto
 */
@Entity
public class Expediente extends Entidade {
    @OneToMany
    private List<Dia> dia;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Expediente() {
    }
    
    public Expediente(List<Dia> dia) {
        this.dia = dia;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Dia> getExpediente() {
        return dia;
    }
    
    public void setExpediente(List<Dia> dia) {
        this.dia = dia;
    }
//</editor-fold>
}
