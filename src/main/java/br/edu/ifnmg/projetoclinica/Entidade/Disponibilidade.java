/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Saulo
 */
@Entity
public class Disponibilidade extends Entidade{

    private enum DiaSemana{segunda, terça, quarta, quinta, sexta}
    private DiaSemana nomeDia;
    @OneToMany
    private List<Horario> horario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Disponibilidade() {
    }
    
    public Disponibilidade(List<Horario> horario, DiaSemana nomeDia) {
        this.horario = horario;
        this.nomeDia=nomeDia;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Horario> getHorario() {
        return horario;
    }
    
    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }
        public DiaSemana getDiaSemana() {
        return nomeDia;
    }
    
    public void setDiaSemana(DiaSemana nomeDia) {
        this.nomeDia = nomeDia;
    }
//</editor-fold>
}
