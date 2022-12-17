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
public interface ConsultaServiceLocal {
    public void save(Consulta consulta) throws Exception;
    public Consulta find(Long ID) throws Exception;
    public void remove(Consulta rem) throws Exception;
    public void update(Consulta updt) throws Exception; 
}
