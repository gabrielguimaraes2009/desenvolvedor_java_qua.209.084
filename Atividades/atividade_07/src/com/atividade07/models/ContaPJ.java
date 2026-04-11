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
    
    public double fazerSaque(double valor) {
        //this.setSaldo(this.getSaldo()-valor-(this.getSaldo()-0.01/100));
        double taxa = valor * 0.0001; // 0,01%
        double novoSaldo = this.getSaldo() - valor - taxa;
        this.setSaldo(novoSaldo);
        return this.getSaldo();
    }

}
