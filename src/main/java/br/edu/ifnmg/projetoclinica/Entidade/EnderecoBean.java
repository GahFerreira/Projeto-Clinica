/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.EnderecoServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "enderecoBean")
@ViewScoped
public class EnderecoBean
        implements Serializable
{
    @Inject
    private EnderecoServiceLocal enderecoService;
    
    private Endereco endereco;

    /**
     * Creates a new instance of EnderecoBean
     */
    public EnderecoBean()
    {
    }
    
    public EnderecoServiceLocal getEnderecoService()
    {
        return enderecoService;
    }
    
    public void setEnderecoService(EnderecoServiceLocal enderecoService)
    {
        this.enderecoService = enderecoService;
    }
    
    public Endereco getEndereco()
    {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }
    
    public void save(Endereco endereco)
            throws Exception
    {
        enderecoService.save(endereco);
    }
    
    public Endereco find(Long ID)
            throws Exception
    {
        return enderecoService.find(ID);
    }
    
    public void remove(Endereco rem)
            throws Exception
    {
        enderecoService.remove(rem);
    }
    
    public void update(Endereco updt)
            throws Exception
    {
        enderecoService.update(updt);
    }
}
