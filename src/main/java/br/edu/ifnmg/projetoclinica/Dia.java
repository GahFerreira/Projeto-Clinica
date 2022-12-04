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
    private String horario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Dia() {
    }
    
    public Dia(String horario) {
        this.horario = horario;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getDia() {
        return horario;
    }
    
    public void setDia(String horario) {
        this.horario = horario;
    }
//</editor-fold>
}
