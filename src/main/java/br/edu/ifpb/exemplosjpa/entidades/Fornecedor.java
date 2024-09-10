package br.edu.ifpb.exemplosjpa.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo;
    private String nome;
    private String cidade;
    @Column(unique = true)
    private String CNPJ;
    private String telefone;
    @ManyToMany
    @JoinTable(
    name = "ofereceEstilo",
    joinColumns = @JoinColumn(name = "fornecedor_id"),
    inverseJoinColumns = @JoinColumn(name = "estilo_id"))
    private List<Estilo> estilos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Estilo> getEstilos() {
        return estilos;
    }

    public void setEstilos(List<Estilo> estilos) {
        this.estilos = estilos;
    }
}
