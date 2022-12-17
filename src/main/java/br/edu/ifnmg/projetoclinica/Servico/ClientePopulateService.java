/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Cliente;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Saulo
 */
@Singleton
@Startup
@DependsOn({"ConsultaPopulateService","ConvenioPopulateService","EnderecoPopulateService"})
public class ClientePopulateService {

    @Inject
    private ClienteServiceLocal clienteService;
    @Inject
    private ConsultaServiceLocal consultaService;
    @Inject
    private ConvenioServiceLocal convenioService;
    @Inject
    private EnderecoServiceLocal enderecoService;

    @PostConstruct
    public void populateDatabase() {
        Cliente[] clientes = new Cliente[3];
        
        clientes[0] = new Cliente(consultaService.find(1L), convenioService.find(1L), 911113111L, "Manuel", LocalDate.of(2001, 1, 1), enderecoService.find(1L));
        clientes[1] = new Cliente(consultaService.find(2L), convenioService.find(2L), 711111111L, "Laura", LocalDate.of(2002, 1, 1), enderecoService.find(2L));
        clientes[2] = new Cliente(consultaService.find(3L), convenioService.find(3L), 911711111L, "Creison", LocalDate.of(2003, 1, 1), enderecoService.find(3L));

        for (Cliente cliente : clientes) {
            System.out.println("> " + cliente);
            clienteService.save(cliente);
        }
    }
}
