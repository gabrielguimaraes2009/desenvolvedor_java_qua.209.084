package com.atividade07.models;

public class PessoaJuridica extends Pessoa{

    // atributos
    private String nomeFantasia;
    private String cnpj;
    private String razaosocial;


    public PessoaJuridica(String nomeFantasia, String cnpj, String razaosocial, String email) {
        super (email);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.razaosocial = razaosocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return this.razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }


}
