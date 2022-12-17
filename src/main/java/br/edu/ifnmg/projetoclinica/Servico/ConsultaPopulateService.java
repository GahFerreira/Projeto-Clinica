/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Consulta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
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
@DependsOn({"ClientePopulateService","MedicoPopulateService"})
public class ConsultaPopulateService {

    @Inject
    private ConsultaServiceLocal consultaService;
    @Inject
    private ClienteServiceLocal clienteService;
    @Inject
    private MedicoServiceLocal medicoService;

    @PostConstruct
    public void populateDatabase() {
        Consulta[] consultas = new Consulta[3];
        
        //LocalDate data, LocalTime hora, Double preco, Cliente cliente, Medico medico
        consultas[0] = new Consulta(LocalDate.of(2011,1,1), LocalTime.now(ZoneId.of("Asia/Jakarta")), 100.0, clienteService.find(1L), medicoService.find(1L));
        consultas[1] = new Consulta(LocalDate.of(2022,2,2), LocalTime.now(ZoneId.of("Asia/Jakarta")), 200.0, clienteService.find(2L), medicoService.find(2L));
        consultas[2] = new Consulta(LocalDate.of(2033,3,3), LocalTime.now(ZoneId.of("Asia/Jakarta")), 300.0, clienteService.find(3L), medicoService.find(3L));

        for (Consulta consulta : consultas) {
            System.out.println("> " + consulta);
            consultaService.save(consulta);
        }
    }
}
