package br.edu.ifnmg.projetoclinica.Entidade;

import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Projeto
 */
@Entity
@NamedQueries(
        {
            @NamedQuery(
                    name = "expediente.loadAll",
                    query = "select t from Expediente t "
            ),
            @NamedQuery(
                    name = "expediente.findAll",
                    query = "select distinct t from Expediente t "
            ),
            @NamedQuery(
                    name = "expediente.findById",
                    query = "select t from Expediente t " +
                            "where t.id = :id"
            )
        })
public class Expediente
        extends Entidade
{
    @OneToMany
    private List<Disponibilidade> dia;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Expediente()
    {
    }

    public Expediente(List<Disponibilidade> dia)
    {
        this.dia = dia;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public List<Disponibilidade> getExpediente()
    {
        return dia;
    }

    public void setExpediente(List<Disponibilidade> dia)
    {
        this.dia = dia;
    }
//</editor-fold>
}
