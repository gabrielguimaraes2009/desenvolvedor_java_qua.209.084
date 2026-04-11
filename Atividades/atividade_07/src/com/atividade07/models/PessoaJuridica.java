package com.atividade07.models;

public class PessoaJuridica extends Pessoa{

    // atributos
    private String nomeFantasia;
    private String cnpj;
    private String Razaosocial;


    public PessoaJuridica(String nomeFantasia, String cnpj, String razaosocial, String email) {
        super (email);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.Razaosocial = razaosocial;
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
        return this.Razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.Razaosocial = razaosocial;
    }


}
