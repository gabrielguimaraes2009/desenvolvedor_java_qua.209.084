package com.atividade07.models;

public class ContaPF extends Conta{

    public PessoaFisica pf;
    public PessoaFisica nome;
    public PessoaFisica cpf;


        public ContaPF(String agencia, String conta, double saldo, PessoaFisica pf) {
            super(agencia, conta);
            this.pf = pf;
    }

    public PessoaFisica getPf() {
        return this.pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

}
