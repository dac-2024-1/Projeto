package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long numeroIdentificador;

    private Date data;

    private int quantidadeItens;

    private Float valorTotal;

    @ManyToOne
    private Fornecedor fornecedor;

    @ManyToOne
    private Funcionario funcionario;

    @OneToOne
    private RegistroFinanceiro registroFinanceiro;
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public RegistroFinanceiro getRegistroFinanceiro() {
        return registroFinanceiro;
    }

    public void setRegistroFinanceiro(RegistroFinanceiro registroFinanceiro) {
        this.registroFinanceiro = registroFinanceiro;
    }
}
