/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.MedicoServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "medicoBean")
@ViewScoped
public class MedicoBean
        implements Serializable
{
    @Inject
    private MedicoServiceLocal medicoService;

    private Medico medico;

    /**
     * Creates a new instance of MedicoBean
     */
    public MedicoBean()
    {
    }

    public MedicoServiceLocal getMedicoService()
    {
        return medicoService;
    }

    public void setMedicoService(MedicoServiceLocal medicoService)
    {
        this.medicoService = medicoService;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }



    public void save(Medico medico)
            throws Exception
    {
        medicoService.save(medico);
    }

    public Medico find(Long ID)
            throws Exception
    {
        return medicoService.find(ID);
    }

    public void remove(Medico rem)
            throws Exception
    {
        medicoService.remove(rem);
    }

    public void update(Medico updt)
            throws Exception
    {
        medicoService.update(updt);
    }
}
