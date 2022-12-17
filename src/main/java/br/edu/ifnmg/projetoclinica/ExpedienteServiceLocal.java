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
public interface ExpedienteServiceLocal {
    public void save(Expediente expediente) throws Exception;
    public Expediente find(Long ID) throws Exception;
    public void remove(Expediente rem) throws Exception;
    public void update(Expediente updt) throws Exception; 
}
