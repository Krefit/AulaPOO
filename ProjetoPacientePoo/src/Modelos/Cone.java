/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Cone {
    private float altura = 0;
    private float raio = 0;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura <= 0)
            throw new Exception("O valor do raio não pode ser negativo nem igual a 0");
        this.altura = altura;
        
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio <= 0)
            throw new Exception("O valor do raio não pode ser negativo nem igual a 0");
        this.raio = raio;
    }
    
    public float calculaGeratriz(){
        float geratriz;
        geratriz = 0;
        
        geratriz = (float) Math.sqrt((altura*altura)+(raio*raio));
        
        return geratriz;
    }
    
    public float areaLateral(){
        float areaL = 0;
        
        areaL = 3.1415f*raio*calculaGeratriz();
        
        return areaL;
    }
    
    public float areaTotal(){
        float areaT = 0;
        
        areaT = 3.1415f*(calculaGeratriz() + raio);
        
        return areaT;
    }
    
    public float volume(){
        float vol = 0;
        
        vol = (float) (3.1415f*(raio*raio)*altura*(1.0/3));
        
        return vol;
    }
}
