/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ALUNO
 */
public class Eleitor {
    private String nome = "";
    private int anoNascimento = 0;
    private int anoAtual = 2022;
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.contains("1") || nome.contains("2") || nome.contains("3") || nome.contains("4") || nome.contains("5")
                || nome.contains("6") || nome.contains("7") || nome.contains("8") || nome.contains("9") || nome.contains("0"))
            throw new Exception("Nome contém caracteres inválidos.");
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if(anoNascimento < 0 || anoNascimento > anoAtual)
            throw new Exception ("Ano de nascimento invalido.");
        this.anoNascimento = anoNascimento;
    }
    
    
    
    public int calculaIdade(){
        int idade = 0;
        
        idade = anoAtual - anoNascimento;
        
        return idade;
    }
    
    public String calculaTipoEleitor(){
        String tipoEleitor = "";
        idade = calculaIdade();
        if(idade < 16)
            tipoEleitor = "Não eleitor";
        else
            if (idade < 18)
                tipoEleitor = "Eleitor Facultativo";
            else if(idade <= 65)
                tipoEleitor = "Eleitor obrigatório";
        else
                tipoEleitor = "Eleitor Facultativo";
        
        
        return tipoEleitor;
    }
}
