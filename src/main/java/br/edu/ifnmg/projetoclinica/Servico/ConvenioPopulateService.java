/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Convenio;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Saulo
 */
@Singleton
@Startup
public class ConvenioPopulateService {

    @Inject
    private ConvenioServiceLocal convenioService;

    @PostConstruct
    public void populateDatabase() {
        Convenio[] convenios = new Convenio[3];
        
        //String nome, Double desconto
        convenios[0] = new Convenio("Xamps", 100.0);
        convenios[1] = new Convenio("CRED", 200.0);
        convenios[2] = new Convenio("FED", 300.0);

        for (Convenio convenio : convenios) {
            System.out.println("> " + convenio);
            convenioService.save(convenio);
        }
    }
}
