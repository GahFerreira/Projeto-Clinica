/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.security;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 *
 * @author Thiago Riquelmo
 */
@ApplicationScoped
public class DataInitializer {

    @Inject
    UserServiceLocal dataService;

    public void execute(@Observes @Initialized(ApplicationScoped.class) Object event) {
        if (dataService.getAllUsers().isEmpty()) {
            User thiago = dataService.createUser("Thiago Riquelmo", "thiagoriquelmo", "1234", "admin");
            User saulo = dataService.createUser("Saulo", "saulo", "1234", "admin");
            User gabriel = dataService.createUser("Gabriel", "gabriel", "1234", "admin");
        }
    }
}