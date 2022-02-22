/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Esfera {
    float raio = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio <= 0)
            throw new Exception("O valor do raio não pode ser negativo nem igual a 0");
        this.raio = raio;
    }
    
    
    
    public float area(){
        float retorno = 0;
        
        retorno = 4*3.1415f*(raio*raio);
        
        return retorno;
    }
    
    public float volume (){
        float retorno = 0;
        
        retorno = (4/3)*3.1415f*(raio*raio*raio);
        
        return retorno;
    }
}
