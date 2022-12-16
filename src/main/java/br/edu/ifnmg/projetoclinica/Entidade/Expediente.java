package br.edu.ifnmg.projetoclinica.Entidade;

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
    private List<Disponibilidade> dia;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Expediente() {
    }
    
    public Expediente(List<Disponibilidade> dia) {
        this.dia = dia;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Disponibilidade> getExpediente() {
        return dia;
    }
    
    public void setExpediente(List<Disponibilidade> dia) {
        this.dia = dia;
    }
//</editor-fold>
}
