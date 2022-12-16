/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.edu.ifnmg.projetoclinica.Servico;

import br.edu.ifnmg.projetoclinica.Entidade.Consulta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Saulo
 */
@Stateless
public class ConsultaService implements ConsultaServiceLocal{
    @PersistenceContext(unitName = "ClinicaDU")
    private EntityManager manager;
    
    @Override
    public void save(Consulta consulta) throws Exception{
        manager.persist(consulta);
    }
    @Override
    public Consulta find(Long ID) throws Exception{
        Consulta ret = manager.find(Consulta.class, ID);
        return ret;
    }
    @Override
    public void remove(Consulta rem) throws Exception{
        manager.remove(rem);
    }
    @Override
    public void update(Consulta updt) throws Exception{
        manager.merge(updt);
    }
}
