package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Parcela implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;
    private Float valorParcela;
    private Date diaPagamento;
    private String status;
    @ManyToOne
    private VendaAPrazo vendaAPrazo;
    @OneToOne
    private RegistroFinanceiro registroFinanceiro;

    public Float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Date getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(Date diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
