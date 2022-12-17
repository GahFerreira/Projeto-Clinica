package br.edu.ifnmg.projetoclinica.Entidade;

import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Projeto
 */
@Entity
@NamedQueries(
        {
            @NamedQuery(
                    name = "horario.loadAll",
                    query = "select t from Horario t "
            ),
            @NamedQuery(
                    name = "horario.findAll",
                    query = "select distinct t from Horario t "
            ),
            @NamedQuery(
                    name = "horario.findById",
                    query = "select t from Horario t " +
                            "where t.id = :id"
            )
        })
public class Horario
        extends Entidade
{
    private LocalTime horario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Horario()
    {
    }

    public Horario(LocalTime horario)
    {
        this.horario = horario;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalTime getDia()
    {
        return horario;
    }

    public void setDia(LocalTime horario)
    {
        this.horario = horario;
    }
//</editor-fold>
}
