/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Saulo
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "disponibilidade.loadAll",
            query = "select t from Disponibilidade t "
    ),
    @NamedQuery(
            name = "disponibilidade.findAll",
            query = "select distinct t from Disponibilidade t "
    ),
    @NamedQuery(
            name = "disponibilidade.findById",
            query = "select t from Disponibilidade t "
            + "where t.id = :id"
    )
})
public class Disponibilidade extends Entidade{

    public enum DiaSemana{segunda, terca, quarta, quinta, sexta}
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
