/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.CredencialServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "credencialBean")
@ViewScoped
public class CredencialBean
        implements Serializable
{
    @Inject
    private CredencialServiceLocal credencialService;

    private Credencial credencial;

    /**
     * Creates a new instance of CredencialBean
     */
    public CredencialBean()
    {
    }

    public CredencialServiceLocal getCredencialService()
    {
        return credencialService;
    }

    public void setCredencialService(CredencialServiceLocal credencialService)
    {
        this.credencialService = credencialService;
    }

    public Credencial getCredencial()
    {
        return credencial;
    }

    public void setCredencial(Credencial credencial)
    {
        this.credencial = credencial;
    }

    public void save(Credencial credencial)
            throws Exception
    {
        credencialService.save(credencial);
    }

    public Credencial find(Long ID)
            throws Exception
    {
        return credencialService.find(ID);
    }

    public void remove(Credencial rem)
            throws Exception
    {
        credencialService.remove(rem);
    }

    public void update(Credencial updt)
            throws Exception
    {
        credencialService.update(updt);
    }
}
