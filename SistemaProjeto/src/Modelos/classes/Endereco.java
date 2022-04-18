/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.classes;

import Modelos.Enumeracoes.TiposEndereco;

/**
 *
 * @author gusta
 */
public class Endereco {
    private String logradouro = "";
    private int numero = 0;
    private int CEP = 0;
    private TiposEndereco endereco;

    public Endereco() {
    }
    
    public Endereco(String logradouro, int numero, int cep, TiposEndereco endereco)
    {
        this.logradouro = logradouro;
        this.numero = numero;
        this.CEP = cep;
        this.endereco = endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public TiposEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(TiposEndereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String str = "";
        str += logradouro + ";";
        str += numero + ";";
        str += CEP + ";";
        str += endereco + ";";
        return str;
    }
    
    
}
