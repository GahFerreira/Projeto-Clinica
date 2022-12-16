/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Medico;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface MedicoServiceLocal {
    public void save(Medico medico) throws Exception;
    public Medico find(Long ID) throws Exception;
    public void remove(Medico rem) throws Exception;
    public void update(Medico updt) throws Exception; 
}
