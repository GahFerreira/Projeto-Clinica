package br.edu.ifnmg.projetoclinica.Entidade;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Projeto
 */
@Entity
public class Consulta extends Entidade {
    private LocalDate dataConsulta;
    private LocalTime horaConsulta;
    private Double preco;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Medico medico;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Consulta() {
    }
    
    public Consulta(LocalDate data, LocalTime hora, Double preco, Cliente cliente, Medico medico) {
        this.dataConsulta = data;
        this.horaConsulta = hora;
        this.preco = preco;
        this.cliente = cliente;
        this.medico = medico;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public LocalDate getDataConsulta() {
        return dataConsulta;
    }
    
    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    
    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }
    
    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
    
    public Double getPreco() {
        return preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
//</editor-fold>
}