/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Interface.ITransacoes;

/**
 *
 * @author gusta
 */
public class ContaCorrenteBasica extends Conta implements ITransacoes {

    protected String tipoConta = "";

    public ContaCorrenteBasica() {
    }

    public ContaCorrenteBasica(String nome, String CPF, String endereco, float saldo, int agencia, int codConta) {
        super(nome, CPF, endereco, saldo, agencia, codConta);
        this.tipoConta = "Conta Corrente Basica";
    }

    @Override
    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public void sacar(float valor) throws Exception {
        saldo -= valor;
    }
    
    
    
}
