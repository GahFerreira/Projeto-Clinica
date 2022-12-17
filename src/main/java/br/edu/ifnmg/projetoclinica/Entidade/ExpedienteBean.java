/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.ExpedienteServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "expedienteBean")
@ViewScoped
public class ExpedienteBean
        implements Serializable
{
    @Inject
    private ExpedienteServiceLocal expedienteService;
    
    private Expediente expediente;

    /**
     * Creates a new instance of ExpedienteBean
     */
    public ExpedienteBean()
    {
    }
    
    public ExpedienteServiceLocal getExpedienteService()
    {
        return expedienteService;
    }
    
    public void setExpedienteService(ExpedienteServiceLocal expedienteService)
    {
        this.expedienteService = expedienteService;
    }
    
    public Expediente getExpediente()
    {
        return expediente;
    }
    
    public void setExpediente(Expediente expediente)
    {
        this.expediente = expediente;
    }
    
    
    
    public void save(Expediente expediente)
            throws Exception
    {
        expedienteService.save(expediente);
    }
    
    public Expediente find(Long ID)
            throws Exception
    {
        return expedienteService.find(ID);
    }
    
    public void remove(Expediente rem)
            throws Exception
    {
        expedienteService.remove(rem);
    }
    
    public void update(Expediente updt)
            throws Exception
    {
        expedienteService.update(updt);
    }
}
