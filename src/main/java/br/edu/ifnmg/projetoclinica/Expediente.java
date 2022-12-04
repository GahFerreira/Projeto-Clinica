package br.edu.ifnmg.projetoclinica;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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
    public List<Dia> getDia() {
        return dia;
    }
    
    public void setDia(List<Dia> dia) {
        this.dia = dia;
    }
//</editor-fold>
}
