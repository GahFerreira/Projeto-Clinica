/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Medico;
import br.edu.ifnmg.projetoclinica.Entidade.Medico.Especialidade;
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
@DependsOn({"ExpedientePopulateService","ConsultaPopulateService","EnderecoPopulateService"})
public class MedicoPopulateService {

    @Inject
    private MedicoServiceLocal medicoService;
    @Inject
    private ExpedienteServiceLocal expedienteService;
    @Inject
    private ConsultaServiceLocal consultaService;
    @Inject
    private EnderecoServiceLocal enderecoService;

    @PostConstruct
    public void populateDatabase() {
        Medico[] medicos = new Medico[3];
        
        //String crm, Double tempoConsulta, Expediente expediente, List<Consulta> consultas, Especialidade especialidade, Long cpf, String nome, LocalDate nascimento, Endereco endereco
        medicos[0] = new Medico("9281", 100.0, expedienteService.find(1L), consultaService.find(1L), Especialidade.Dentista, 92929191L, "Jao", LocalDate.of(1991,1,1), enderecoService.find(1L));
        medicos[1] = new Medico("9281", 200.0, expedienteService.find(2L), consultaService.find(2L), Especialidade.Dentista, 92969191L, "Ana", LocalDate.of(1992,1,1), enderecoService.find(2L));
        medicos[2] = new Medico("9281", 300.0, expedienteService.find(3L), consultaService.find(3L), Especialidade.Pneumologista, 96919191L, "Mario", LocalDate.of(1993,1,1), enderecoService.find(3L));

        for (Medico medico : medicos) {
            System.out.println("> " + medico);
            medicoService.save(medico);
        }
    }
}
