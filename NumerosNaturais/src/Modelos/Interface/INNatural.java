/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.Interface;

import Modelos.Classes.NNatural;

/**
 *
 * @author gusta
 */
public interface INNatural {
    public int getNumero();
    public void setNumero(int numero)throws Exception;
    public void setNumero(NNatural numero);
    public boolean eNumeroQuadradoPerfeito();
    public NNatural calcularFatorial()throws Exception;
    public boolean eNumeroPerfeito();
    public boolean eCapicua();
    public boolean ePrimo();
    public NNatural calcularMMC( NNatural num2) throws Exception;
    public NNatural calcularMDC(NNatural num2)throws Exception;
    public String mudarBase(int num2);
}
