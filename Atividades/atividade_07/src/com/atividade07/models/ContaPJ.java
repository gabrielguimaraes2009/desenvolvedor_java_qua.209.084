package com.atividade07.models;

public class ContaPJ extends Conta{

    private PessoaJuridica pj;

     public ContaPJ(String agencia, String conta, double saldo, PessoaJuridica pj) {
        super(agencia, conta);
        this.pj = pj;
    } 

    public PessoaJuridica getPj() {
        return this.pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }

}
