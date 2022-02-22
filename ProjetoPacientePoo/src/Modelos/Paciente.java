/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Paciente {
    
    //Atributos
    private String nomeCompleto = "";
    private int peso = 0;
    private float altura = 0;
    private String genero = "";
    
    //Metodos
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    //Atributos
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public float calcularIMC()
    {
        float retorno = 0;
        
        retorno = peso/(altura*altura);
        
        return retorno;
    }
}
