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
public class PacienteP4 {
    private String nome = "";
    private float peso = 0;
    private float altura = 0;
    private float imc = calcularIMC();
    
    public float calcularIMC(){
        float imc = 0;
        
        imc = peso /(altura*altura);
        
        return imc;
    }
    
    public String faixaPeso(){
        String ret = "";
        
        if(imc > 20){
            
        }
        
        return ret;
    }
    
}
