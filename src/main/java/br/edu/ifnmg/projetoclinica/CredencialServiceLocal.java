/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.projetoclinica;

import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface CredencialServiceLocal {
    public void save(Credencial credencial) throws Exception;
    public Credencial find(Long ID) throws Exception;
    public void remove(Credencial rem) throws Exception;
    public void update(Credencial updt) throws Exception; 
}
