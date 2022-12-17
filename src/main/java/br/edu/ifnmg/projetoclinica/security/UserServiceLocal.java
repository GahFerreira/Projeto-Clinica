/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.security;

import java.util.List;
import java.util.Optional;
import javax.ejb.Local;

/**
 *
 * @author Thiago Riquelmo
 */
@Local
public interface UserServiceLocal {
    
    public User createUser(String name, String username, String password, String group);
    
    public List<User> getAllUsers();
    
    public Optional<User> getUser(String username);
}
