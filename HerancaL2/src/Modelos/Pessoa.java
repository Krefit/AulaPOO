/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Interface.ITabelaImpostoRenda;

/**
 *
 * @author gusta
 */
abstract public class Pessoa implements ITabelaImpostoRenda{
    protected String nome = "";
    protected String endereco = "";
    protected String telefone = "";
    protected String email = "";
    protected float rendaBruta = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public Pessoa(String nome, String endereco, String telefone, String email, float rendaBruta) throws Exception{
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        if(rendaBruta < 0)
            throw new Exception("Renda bruta não pode ser menor que 0");
        this.rendaBruta = rendaBruta;
    }
    public Pessoa(){
        
    };

    public enum tipoPessoa{
        FISICA,JURIDICA;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "\nnome=" + nome + ", \nendereco=" + endereco + ", \ntelefone=" + telefone + ", \nemail=" + email + ", \nrendaBruta=" + rendaBruta + '}';
    }
    
    
    
    
    //abstract public float calculaImpostoRenda();
}
