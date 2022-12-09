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
public interface DiaServiceLocal {
    public void save(Dia die) throws Exception;
    public Dia find(Long ID) throws Exception;
    public void remove(Dia rem) throws Exception;
    public void update(Dia updt) throws Exception; 
}
