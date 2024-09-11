package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class PedidoContemProduto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Estoque estoque;

    private Float valorIndv;
    
    private Float quantIndv;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Float getValorIndv() {
        return valorIndv;
    }

    public void setValorIndv(Float valorIndv) {
        this.valorIndv = valorIndv;
    }

    public Float getQuantIndv() {
        return quantIndv;
    }

    public void setQuantIndv(Float quantIndv) {
        this.quantIndv = quantIndv;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
