package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;
    private Date data;
    private Float valorTotal;
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

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
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
