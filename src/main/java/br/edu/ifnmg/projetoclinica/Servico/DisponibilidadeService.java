/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Disponibilidade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class DisponibilidadeService implements DisponibilidadeServiceLocal {
@PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Disponibilidade dia) throws Exception{
        manager.persist(dia);
    }
    @Override
    public Disponibilidade find(Long ID) throws Exception{
        Disponibilidade ret = manager.find(Disponibilidade.class, ID);
        return ret;
    }
    @Override
    public void remove(Disponibilidade rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Disponibilidade updt) throws Exception{
        manager.merge(updt); //talvez precise atualizar semelhante à remove
    }
}
