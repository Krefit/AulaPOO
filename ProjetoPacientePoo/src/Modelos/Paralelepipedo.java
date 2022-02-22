/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Paralelepipedo {

    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public float volume() throws Exception{
        float volume = 0;
        if(largura <= 0 || altura <= 0) 
            throw new Exception ("Largura e/ou altura não podem ser menor ou igual a zero");
        volume = altura * comprimento * largura;
        return volume;
    }
    
    public float area() throws Exception{
        float area = 0;
        
        if(altura <= 0 || comprimento <= 0 || largura <= 0)
                throw new Exception ("largura e/ou altura e/ou compriento não podem ser menor ou igual a zero");
        area = (2*altura) + (2*comprimento) + (2*largura);
        return area;
    }
    
    
    
}
