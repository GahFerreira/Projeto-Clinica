/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Expediente;
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
@DependsOn("DisponibilidadePopulateService")
public class ExpedientePopulateService {

    @Inject
    private ExpedienteServiceLocal expedienteService;
    @Inject
    private DisponibilidadeServiceLocal disponibilidadeService;

    @PostConstruct
    public void populateDatabase() {
        Expediente[] expedientes = new Expediente[3];
        
        //List<Disponibilidade> dia
        expedientes[0] = new Expediente(disponibilidadeService.find(1L));
        expedientes[1] = new Expediente(disponibilidadeService.find(2L));
        expedientes[2] = new Expediente(disponibilidadeService.find(3L));

        for (Expediente expediente : expedientes) {
            System.out.println("> " + expediente);
            expedienteService.save(expediente);
        }
    }
}
