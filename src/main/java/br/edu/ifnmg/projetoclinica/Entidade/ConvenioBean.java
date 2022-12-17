/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.ConvenioServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "convenioBean")
@ViewScoped
public class ConvenioBean
        implements Serializable
{
    @Inject
    private ConvenioServiceLocal convenioService;

    private Convenio convenio;
    /**
     * Creates a new instance of ConvenioBean
     */
    public ConvenioBean()
    {
    }

    public ConvenioServiceLocal getConvenioService()
    {
        return convenioService;
    }

    public void setConvenioService(ConvenioServiceLocal convenioService)
    {
        this.convenioService = convenioService;
    }

    public Convenio getConvenio()
    {
        return convenio;
    }

    public void setConvenio(Convenio convenio)
    {
        this.convenio = convenio;
    }

    
    
    public void save(Convenio convenio) throws Exception
    {
        convenioService.save(convenio);
    }
    
    public Convenio find(Long ID) throws Exception
    {
        return convenioService.find(ID);
    }
    
    public void remove(Convenio rem) throws Exception
    {
        convenioService.remove(rem);
    }
    
    public void update(Convenio updt) throws Exception
    {
        convenioService.update(updt);
    }

}
