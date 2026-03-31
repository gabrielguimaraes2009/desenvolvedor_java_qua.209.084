package com.heranca.models;

public class PessoaJuridica extends Pessoa {
    // atributos
    public String nomeFantasia;
    public String cnpj;
    public String razaoSocial;
    public String website;
    public String endereço;

    // construtor
    public PessoaJuridica() {
    }
    // metodo
    public String recepcionar(String nome) {
        return "Prazer, " + nome + ". Somos a empresa " + this.nomeFantasia + ".";
    }

}
