/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.projetoclinica;

import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface ClienteServiceLocal {
    public void save(Cliente cliente) throws Exception;
    public Cliente find(Long ID) throws Exception;
    public void remove(Cliente rem) throws Exception;
    public void update(Cliente updt) throws Exception;   
}
