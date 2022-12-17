/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Consulta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface ConsultaServiceLocal {
    public void save(Consulta consulta);
    public List<Consulta> find(Long ID);
    public void remove(Consulta rem);
    public void update(Consulta updt); 
}
