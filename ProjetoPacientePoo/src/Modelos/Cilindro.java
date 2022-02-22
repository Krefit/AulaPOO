/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Cilindro {

    private float raio = 0;
    private float altura = 0;
    
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio <= 0) 
            throw new Exception ("Raio não pode ser menor ou igual a 0.");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0) 
            throw new Exception ("Altura não pode ser menor ou igual a 0.");
        this.altura = altura;
    }
    
    public float areaLateral(){
        float areaL = 0;
        
        areaL = 2*3.1415f*raio*altura;
        
        return areaL;
    }
    
    public float areaTotal(){
        float areaT = 0;
        
        areaT = 2*3.1415f*raio*(altura+raio);
        
        return areaT;
    }
    
    public float volume(){
        float vol = 0;
        
        vol = 3.1415f*raio*raio*altura;
        
        return vol;
    }
    
    
}
