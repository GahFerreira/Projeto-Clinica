/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.DisponibilidadeServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "disponibilidadeBean")
@ViewScoped
public class DisponibilidadeBean
        implements Serializable
{
    @Inject
    private DisponibilidadeServiceLocal disponibilidadeService;
    
    private Disponibilidade disponibilidade;
    
    /**
     * Creates a new instance of DisponibilidadeBean
     */
    public DisponibilidadeBean()
    {
    }

    public DisponibilidadeServiceLocal getDisponibilidadeService()
    {
        return disponibilidadeService;
    }

    public void setDisponibilidadeService(DisponibilidadeServiceLocal disponibilidadeService)
    {
        this.disponibilidadeService = disponibilidadeService;
    }

    public Disponibilidade getDisponibilidade()
    {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade)
    {
        this.disponibilidade = disponibilidade;
    }
    
    
    
    public void save(Disponibilidade dia) throws Exception
    {
        disponibilidadeService.save(dia);
    }
            
    public Disponibilidade find(Long ID) throws Exception
    {
        return disponibilidadeService.find(ID);
    }
            
    public void remove(Disponibilidade rem) throws Exception
    {
        disponibilidadeService.remove(rem);
    }
            
    public void update(Disponibilidade updt) throws Exception
    {
        disponibilidadeService.update(updt);
    }
}
