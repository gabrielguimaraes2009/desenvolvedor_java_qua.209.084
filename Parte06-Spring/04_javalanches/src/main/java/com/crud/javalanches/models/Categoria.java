package com.crud.javalanches.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;

@Entity
public class Categoria {
 private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCategoria;

    @Column(nullable = false, unique = true)
    private String nomeCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();


    public Categoria() {
    }

    public long getCodigoCategoria() {
        return this.codigoCategoria;
    }

    public void setCodigoCategoria(long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
