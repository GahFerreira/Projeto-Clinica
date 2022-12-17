/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Endereco;
import br.edu.ifnmg.projetoclinica.Entidade.Endereco.Estado;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author Saulo
 */
@Singleton
@Startup
public class EnderecoPopulateService {

    @Inject
    private EnderecoServiceLocal enderecoService;

    @PostConstruct
    public void populateDatabase() {
        Endereco[] enderecos = new Endereco[3];
        
        //Integer numero, String rua, String bairro, String cidade, Integer cep, Estado estado
        enderecos[0] = new Endereco(1, "Um", "Primeiro", "Primeira", 2813983, Estado.AC);
        enderecos[1] = new Endereco(2, "Dois", "Segundo", "Segunda", 1843983, Estado.AM);
        enderecos[2] = new Endereco(3, "Três", "Terceiro", "Terceira", 2863983, Estado.MG);

        for (Endereco endereco : enderecos) {
            System.out.println("> " + endereco);
            enderecoService.save(endereco);
        }
    }
}
