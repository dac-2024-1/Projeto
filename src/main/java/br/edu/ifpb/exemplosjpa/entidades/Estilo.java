package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Estilo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;
    private String descricao;
    @ManyToMany(mappedBy = "estilos")
    private List<Fornecedor> fornecedores;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
}
