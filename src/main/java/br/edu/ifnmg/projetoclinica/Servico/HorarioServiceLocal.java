/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Horario;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface HorarioServiceLocal {
    public void save(Horario die) throws Exception;
    public Horario find(Long ID) throws Exception;
    public void remove(Horario rem) throws Exception;
    public void update(Horario updt) throws Exception; 
}
