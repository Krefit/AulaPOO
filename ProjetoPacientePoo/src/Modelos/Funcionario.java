/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Funcionario {
    private String nome = "";
    private float salarioMes = 0;
    private int qtdFilhos = 0;
    private float aumentoSalarial = 0;
    private float novoSalario = 0;
    
    public float getNovoSalario(){
        return novoSalario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if (nome.contains("1") || nome.contains("2") || nome.contains("3") || nome.contains("4") || nome.contains("5")
                || nome.contains("6") || nome.contains("7") || nome.contains("8") || nome.contains("9") || nome.contains("0"))
            throw new Exception("Nome contém caracteres inválidos.");
        this.nome = nome;
    }

    public float getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(float salarioMes) throws Exception{
        if(salarioMes < 0)
            throw new Exception ("Valor de salário invalido.");
        this.salarioMes = salarioMes;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) throws Exception{
        if(qtdFilhos < 0)
            throw new Exception("Quantidade de filhos não pode ser menor que zero.");
        this.qtdFilhos = qtdFilhos;
    }

    public float getAumentoSalarial() {
        return aumentoSalarial;
    }

    public void setAumentoSalarial(float aumentoSalarial) throws Exception{
        if(aumentoSalarial < 0)
            throw new Exception("Valor de aumento salarial invalido.");
        this.aumentoSalarial = aumentoSalarial;
    }
    
    
    
    public float calculaAumentoSalarial(){
        float aumentoSal = 0;
        
        aumentoSal = salarioMes * (aumentoSalarial/100);
        novoSalario = aumentoSal;
        return aumentoSal;
    }
    
    public float calculaINSS(){
        float inss = 0;
        
        if(novoSalario <= 3545.00f)
            inss = novoSalario * 0.06f;
        else
            inss = novoSalario * 0.1f;
        
        return inss;
    }
    
    public float calculaParcelaIR(){
        float parIR = 0;
        
        
        
        return parIR;
    }
    
}
