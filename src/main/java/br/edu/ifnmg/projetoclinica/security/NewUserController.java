/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.security;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Thiago Riquelmo
 */
@Named
@RequestScoped
public class NewUserController {
    
    @Inject
    UserServiceLocal dataService;
    
    private User user;
    private List<String> qualities;

    /**
     * Creates a new instance of NewUserController
     */
    public NewUserController() {
        user = new User();
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //</editor-fold>
    
    public String save() {
        user = dataService.createUser(
                user.getName(), 
                user.getUsername(), 
                user.getPassword(), 
                user.getGroup());
        
        return "/index?faces-redirect=true";
    }
    
}
