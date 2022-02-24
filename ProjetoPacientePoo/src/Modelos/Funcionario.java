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
    private float parcelaINSS = 0;

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

    public float getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(float salarioMes) throws Exception {
        if (salarioMes < 0) {
            throw new Exception("Valor de salário invalido.");
        }
        this.salarioMes = salarioMes;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) throws Exception {
        if (qtdFilhos < 0) {
            throw new Exception("Quantidade de filhos não pode ser menor que zero.");
        }
        this.qtdFilhos = qtdFilhos;
    }

    public float calculaAumentoSalarial(float aumentoSalarial) {
        float novoSalario = 0;

        novoSalario = salarioMes + salarioMes * (aumentoSalarial / 100);
        this.aumentoSalarial = novoSalario;
        return novoSalario;
    }

    public String calculaINSS() {
        String inss = "";
        float varCalcula = 0;

        if (aumentoSalarial <= 2903.98f) {
            inss = "Isento";
        } else if (aumentoSalarial < 3826.65f) {
            varCalcula = aumentoSalarial * 0.075f;
            inss = Float.toString(varCalcula);
        } else if (aumentoSalarial < 4751.05f) {
            varCalcula = aumentoSalarial * 0.15f;
            inss = Float.toString(varCalcula);
        } else if (aumentoSalarial < 5664.68f) {
            varCalcula = aumentoSalarial * 0.225f;
            inss = Float.toString(varCalcula);
        } else {
            varCalcula = aumentoSalarial * 0.275f;
            inss = Float.toString(varCalcula);
        }
        parcelaINSS = varCalcula;
        //inss = Float.toString(varCalcula);

        return inss;
    }
    
    public float calculaIRPF(){
        float irpf = 0;
        
        irpf = parcelaINSS-(qtdFilhos * 145f);
        
        if(irpf < 0)
            return 0;
        
        return irpf;
    }

}
