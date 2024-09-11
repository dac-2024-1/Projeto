package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@DiscriminatorValue("vendaAPrazo")
public class VendaAPrazo extends Venda {

    private Float acrescimoDoValor;
    private int numeroParcelas;

    public Float getAcrescimoDoValor() {
        return acrescimoDoValor;
    }

    public void setAcrescimoDoValor(Float acrescimoDoValor) {
        this.acrescimoDoValor = acrescimoDoValor;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
