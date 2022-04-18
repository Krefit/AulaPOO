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
public class ContaCorrenteLimite extends Conta implements ITransacoes {
    protected String tipoConta = "";
    protected float limite = 0;

    public ContaCorrenteLimite() {
    }

    public ContaCorrenteLimite(String nome, String CPF, String endereco, float saldo, int agencia, int codConta) {
        super(nome, CPF, endereco, saldo, agencia, codConta);
        this.tipoConta = "Conta corrente com limite";
    }

    @Override
    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public void sacar(float valor) throws Exception {
        float total = saldo+limite;
        if(valor > total) 
            throw new Exception("Valor além do limite de saque!");
        if(valor > saldo){
            limite = limite+(saldo-valor);
            saldo = saldo - valor;
        }
    }
    
    
    
    
}
