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
public interface ConvenioServiceLocal {
    public void save(Convenio convenio) throws Exception;
    public Convenio find(Long ID) throws Exception;
    public void remove(Convenio rem) throws Exception;
    public void update(Convenio updt) throws Exception; 
}
