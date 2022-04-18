/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.classes;

import Modelos.Enumeracoes.TiposTelefone;

/**
 *
 * @author gusta
 */
public class Telefone {
    private int DDI = 0;
    private int DDD = 0;
    private int telefone = 0;
    private TiposTelefone tipo;

    public Telefone() {
    }
    
    public Telefone(int ddi, int ddd, int telefone, TiposTelefone tipo)
    {
        this.DDI = ddi;
        this.DDD = ddd;
        this.telefone = telefone;
        this. tipo = tipo;
    }
    
    public int getDDI() {
        return DDI;
    }

    public void setDDI(int DDI) {
        this.DDI = DDI;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public TiposTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TiposTelefone tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        String str = "";
        //ddi, ddd, telefone, tipo
        str += DDI + ";";
        str += DDD + ";";
        str += telefone  + ";";
        str += tipo + ";";
        return str;
    }
    
    
}
