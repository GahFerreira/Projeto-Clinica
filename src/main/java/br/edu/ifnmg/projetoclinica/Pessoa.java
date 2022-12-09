package br.edu.ifnmg.projetoclinica;

import java.time.LocalDate;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author Projeto
 */
@MappedSuperclass
public abstract class Pessoa extends Entidade {
    private Long cpf;
    private String nome;
    private LocalDate nascimento;
    @OneToOne
    private Endereco endereco;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Pessoa() {
    }

    public Pessoa(Long cpf, String nome, LocalDate nascimento, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }
    
    public Pessoa(Long cpf, String nome, LocalDate nascimento, Endereco endereco, Long id) {
        super(id);
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCpf() {
        return cpf;
    }
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public LocalDate getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
//</editor-fold>
}
