package br.edu.ifnmg.projetoclinica.Entidade;

import br.edu.ifnmg.projetoclinica.Servico.ClienteServiceLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author GahFerreira
 */
@Named(value = "clienteBean")
@ViewScoped
public class ClienteBean
        implements Serializable
{
    @Inject
    private ClienteServiceLocal clienteService;
    
    private Cliente clienteSelecionado;
    
    private List<Cliente> clientes;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean()
    {
    }

//    @PostConstruct
//    public void init()
//    {
//        if (clientes == null)
//        {
//            clientes = findAll();
//        }
//    }

    public ClienteServiceLocal getClienteService()
    {
        return clienteService;
    }
    
    public void setClienteService(ClienteServiceLocal clienteService)
    {
        this.clienteService = clienteService;
    }
    
    public Cliente getClienteSelecionado()
    {
        return clienteSelecionado;
    }
    
    public void setClienteSelecionado(Cliente clienteSelecionado)
    {
        this.clienteSelecionado = clienteSelecionado;
    }
    
    public List<Cliente> getClientes()
    {
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes)
    {
        this.clientes = clientes;
    }
    
    public void save(Cliente cliente)
            throws Exception
    {
        clienteService.save(cliente);
    }
    
    public Cliente find(Long ID)
            throws Exception
    {
        return clienteService.find(ID);
    }
    
    public void remove(Cliente rem)
            throws Exception
    {
        clienteService.remove(rem);
    }
    
    public void update(Cliente updt)
            throws Exception
    {
        clienteService.update(updt);
    }
}
