package br.edu.ifnmg.projetoclinica;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Projeto
 */
@Entity
public class Expediente extends Entidade {
    private List<LocalTime> segunda;
    private List<LocalTime> terca;
    private List<LocalTime> quarta;
    private List<LocalTime> quinta;
    private List<LocalTime> sexta;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Expediente() {
    }
    
    public Expediente(List<LocalTime> segunda, List<LocalTime> terca, List<LocalTime> quarta, List<LocalTime> quinta, List<LocalTime> sexta) {
        this.segunda = segunda;
        this.terca = terca;
        this.quarta = quarta;
        this.quinta = quinta;
        this.sexta = sexta;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<LocalTime> getSegunda() {
        return segunda;
    }
    
    public void setSegunda(List<LocalTime> segunda) {
        this.segunda = segunda;
    }
    
    public List<LocalTime> getTerca() {
        return terca;
    }
    
    public void setTerca(List<LocalTime> terca) {
        this.terca = terca;
    }
    
    public List<LocalTime> getQuarta() {
        return quarta;
    }
    
    public void setQuarta(List<LocalTime> quarta) {
        this.quarta = quarta;
    }
    
    public List<LocalTime> getQuinta() {
        return quinta;
    }
    
    public void setQuinta(List<LocalTime> quinta) {
        this.quinta = quinta;
    }
    
    public List<LocalTime> getSexta() {
        return sexta;
    }
    
    public void setSexta(List<LocalTime> sexta) {
        this.sexta = sexta;
    }
//</editor-fold>
}
