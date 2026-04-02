package com.encapsulamento.models;

public class PessoaFisica extends Pessoa {

    // atributos
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf, String email, String telefone) {
        super(email, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    }


