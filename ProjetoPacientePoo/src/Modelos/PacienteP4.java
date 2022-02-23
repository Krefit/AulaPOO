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
    private float imc = 0;//calcularIMC();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.contains("1") || nome.contains("2") || nome.contains("3") || nome.contains("4") || nome.contains("5")
                || nome.contains("6") || nome.contains("7") || nome.contains("8") || nome.contains("9") || nome.contains("0")) {
            throw new Exception("Nome contém caracteres inválidos.");
        }
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        if (peso < 0) {
            throw new Exception("Valor de peso não pode ser menor que zero (0)");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if (altura < 0) {
            throw new Exception("Valor de altura não pode ser menor que zero");
        }
        this.altura = altura;
    }

    public float calcularIMC() {
        float imc = 0;

        imc = peso / (altura * altura);

        return imc;
    }

    public String faixaPeso() throws Exception {
        String ret = "";
        float imc = 0;

        imc = peso / (altura * altura);

        if (imc <= 20) {
            ret = "Abaixo do peso ideal";
        } else if (imc <= 25) {
            ret = "Peso normal";
        } else if (imc <= 30) {
            ret = "Excesso de peso";
        } else if (imc <= 35) {
            ret = "Obesidade";
        } else if (imc > 35) {
            ret = "Obesidade mórbida";
        } else {
            throw new Exception("Valor de peso ou altura inválido");
        }

        return ret;
    }

}
