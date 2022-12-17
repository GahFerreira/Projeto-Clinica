/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.ConsultaServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "consultaBean")
@ViewScoped
public class ConsultaBean
        implements Serializable
{
    @Inject
    private ConsultaServiceLocal consultaService;
    
    private Consulta consultaSelecionada;


    /**
     * Creates a new instance of ConsultaBean
     */
    public ConsultaBean()
    {
    }
    
    public ConsultaServiceLocal getConsultaService()
    {
        return consultaService;
    }
    
    public void setConsultaService(ConsultaServiceLocal consultaService)
    {
        this.consultaService = consultaService;
    }
    
    public Consulta getConsultaSelecionada()
    {
        return consultaSelecionada;
    }
    
    public void setConsultaSelecionada(Consulta consultaSelecionada)
    {
        this.consultaSelecionada = consultaSelecionada;
    }
    
    public void save(Consulta consulta)
            throws Exception
    {
        consultaService.save(consulta);
    }
    
    public Consulta find(Long ID)
            throws Exception
    {
        return consultaService.find(ID);
    }
    
    public void remove(Consulta rem)
            throws Exception
    {
        consultaService.remove(rem);
    }
    
    public void update(Consulta updt)
            throws Exception
    {
        consultaService.update(updt);
    }
    
}
