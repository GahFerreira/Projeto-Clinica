package br.edu.ifnmg.projetoclinica;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Projeto
 */
@Entity
public class Dia extends Entidade {
    private List<LocalTime> horario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Dia() {
    }
    
    public Dia(List<LocalTime> horario) {
        this.horario = horario;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<LocalTime> getDia() {
        return horario;
    }
    
    public void setDia(List<LocalTime> horario) {
        this.horario = horario;
    }
//</editor-fold>
}
