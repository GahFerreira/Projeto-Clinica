/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.HorarioServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "horarioBean")
@ViewScoped
public class HorarioBean
        implements Serializable
{
    @Inject
    private HorarioServiceLocal horarioService;
    
    private Horario horario;


    /**
     * Creates a new instance of HorarioBean
     */
    public HorarioBean()
    {
    }
    
    public HorarioServiceLocal getHorarioService()
    {
        return horarioService;
    }
    
    public void setHorarioService(HorarioServiceLocal horarioService)
    {
        this.horarioService = horarioService;
    }
    
    public Horario getHorario()
    {
        return horario;
    }
    
    public void setHorario(Horario horario)
    {
        this.horario = horario;
    }
    
    
    public void save(Horario die)
            throws Exception
    {
        horarioService.save(die);
    }
    
    public Horario find(Long ID)
            throws Exception
    {
        return horarioService.find(ID);
    }    
    
    public void remove(Horario rem)
            throws Exception
    {
        horarioService.remove(rem);
    }
    
    public void update(Horario updt)
            throws Exception
    {
        horarioService.update(updt);
    }
    
}
