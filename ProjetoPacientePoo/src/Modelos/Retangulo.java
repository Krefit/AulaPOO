/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Retangulo {
    float largura = 0;
    float comprimento = 0;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception {
        if(largura <= 0) 
            throw new Exception ("O valor da largura não pode ser negativo nem 0");
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if(comprimento <= 0)
            throw new Exception ("O valor do comprimento não pode ser negativo nem 0");
        this.comprimento = comprimento;
    }
    
    public float area()
    {
        float area = 0;
        
        area = largura*comprimento;
        
        return area;
    }
    
    public float perimetro()
    {
        float perimetro = 0;
        
        perimetro = 2*largura + 2*comprimento;
        
        return perimetro;
    }
}
