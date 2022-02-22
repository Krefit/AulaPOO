/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Piramide {
    float altura = 0;
    float base = 0;
    
    public float volume()
    {
        float volume = 0;
        
        volume = (base * altura)/3;
        
        return volume;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0)
            throw new Exception ("O valor da altura não pode ser negativo nem 0");
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) throws Exception{
        if(base <= 0)
            throw new Exception ("O valor da base não pode ser negativo nem 0");
        this.base = base;
    }
    
    
}
