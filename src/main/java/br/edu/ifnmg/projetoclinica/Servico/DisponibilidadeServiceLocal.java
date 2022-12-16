/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Disponibilidade;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface DisponibilidadeServiceLocal {
    public void save(Disponibilidade dia) throws Exception;
    public Disponibilidade find(Long ID) throws Exception;
    public void remove(Disponibilidade rem) throws Exception;
    public void update(Disponibilidade updt) throws Exception; 
}
