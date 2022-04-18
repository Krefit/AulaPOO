/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Interface.IVeiculo;

/**
 *
 * @author gusta
 */
public class Aviao implements IVeiculo {
    private String modelo = "";
    private int qtdPassageiros = 0;
    private String nomeVeiculo = "";

    public Aviao() {
    }

    public Aviao(String modelo, String nomeVeiculo, int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
        this.modelo = modelo;
        this.nomeVeiculo = nomeVeiculo;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dirigir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void partida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
