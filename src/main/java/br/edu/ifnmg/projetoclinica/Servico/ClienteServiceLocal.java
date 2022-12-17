/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Saulo
 */
@Local
public interface ClienteServiceLocal {
    public void save(Cliente cliente);
    public Cliente find(Long ID);
    public void remove(Cliente rem);
    public void update(Cliente updt);   
}
