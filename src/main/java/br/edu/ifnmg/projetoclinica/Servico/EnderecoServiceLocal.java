/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Endereco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface EnderecoServiceLocal {
    public void save(Endereco endereco);
    public Endereco find(Long ID);
    public void remove(Endereco rem);
    public void update(Endereco updt); 
}
