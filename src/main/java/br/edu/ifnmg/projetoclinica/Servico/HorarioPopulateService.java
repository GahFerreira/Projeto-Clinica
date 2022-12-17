/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Horario;
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
public class HorarioPopulateService {

    @Inject
    private HorarioServiceLocal horarioService;

    @PostConstruct
    public void populateDatabase() {
        Horario[] horarios = new Horario[3];
        
        //LocalTime horario
        horarios[0] = new Horario(LocalTime.now(ZoneId.of("Asia/Jakarta")));
        horarios[1] = new Horario(LocalTime.now(ZoneId.of("America/Sao_Paulo")));
        horarios[2] = new Horario(LocalTime.now(ZoneId.of("America/New_York")));

        for (Horario horario : horarios) {
            System.out.println("> " + horario);
            horarioService.save(horario);
        }
    }
}
