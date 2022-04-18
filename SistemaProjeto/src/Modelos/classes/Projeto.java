/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.classes;

import Modelos.Enumeracoes.SituacaoProjeto;

/**
 *
 * @author gusta
 */
public class Projeto {
    private int id = 0;
    private String titulo = "";
    private String descricao = "";
    private float valor = 0;
    private SituacaoProjeto situacao;

    public Projeto() {
    }
    
    public Projeto(int id, String titulo, String descricao, float valor, SituacaoProjeto situacao)
    {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public SituacaoProjeto getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoProjeto situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        String str = "";
        //int id, String titulo, String descricao, float valor, SituacaoProjeto situacao)
        str += id +";";
        str += titulo +";";
        str += descricao +";";
        str += valor +";";
        str += situacao +";";
        
        return str;
    }
    
    
}
