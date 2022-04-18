/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author gusta
 */
public class Conta {
    protected String nome = "";
    protected String CPF = "";
    protected String endereco = "";
    protected float saldo = 0;
    protected int agencia = 0;
    protected int codConta = 0;
    

    public Conta() {
    }
    
    public Conta(String nome, String CPF, String endereco, float saldo, int agencia, int codConta) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.saldo = saldo;
        this.codConta = codConta;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    
    
}
