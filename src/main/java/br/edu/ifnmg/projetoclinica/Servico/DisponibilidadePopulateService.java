/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Disponibilidade;
import br.edu.ifnmg.projetoclinica.Entidade.Disponibilidade.DiaSemana;
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
@DependsOn("HorarioPopulateService")
public class DisponibilidadePopulateService {

    @Inject
    private DisponibilidadeServiceLocal disponibilidadeService;
    @Inject
    private HorarioServiceLocal horarioService;

    @PostConstruct
    public void populateDatabase() {
        Disponibilidade[] disponibilidades = new Disponibilidade[3];
        
        //List<Horario> horario, DiaSemana nomeDia
        disponibilidades[0] = new Disponibilidade(horarioService.find(1L), DiaSemana.segunda);
        disponibilidades[1] = new Disponibilidade(horarioService.find(2L), DiaSemana.terca);
        disponibilidades[2] = new Disponibilidade(horarioService.find(3L), DiaSemana.quarta);

        for (Disponibilidade disponibilidade : disponibilidades) {
            System.out.println("> " + disponibilidade);
            disponibilidadeService.save(disponibilidade);
        }
    }
}
