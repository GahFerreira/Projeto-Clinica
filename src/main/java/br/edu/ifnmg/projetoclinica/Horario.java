package br.edu.ifnmg.projetoclinica;

import java.time.LocalTime;
import javax.persistence.Entity;

/**
 *
 * @author Projeto
 */
@Entity
public class Horario extends Entidade {
    private LocalTime horario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Horario() {
    }
    
    public Horario(LocalTime horario) {
        this.horario = horario;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalTime getDia() {
        return horario;
    }
    
    public void setDia(LocalTime horario) {
        this.horario = horario;
    }
//</editor-fold>
}
