/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades;

import OrdenacaoBusca.Busca;


/**
 *
 * @author gusta
 */
public class Atividade1 {
    public static void main(String[] args) {
        
        int vetor[] = new int[100000];
        int cont = 0;
        int x = 43311;
        int inicio = 1;
        int fim = 100000;
        int vetor2[] = vetor;
        while(cont < vetor.length){
            vetor[cont] = Busca.sorteia(inicio,fim);
            cont++;
        }
        
        
        long timeInicio = System.currentTimeMillis();       
        
        if(Busca.buscaSeq(vetor, x))
            System.out.println(x + " existe no vetor;");
        else
            System.out.println(x + " não existe no vetor;");
        
        long timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio));
        /*------------------------------------------------------*/
        /*------------------------------------------------------*/
        /*------------------------------------------------------*/
              
        vetor2 = Busca.ordSelectSort(vetor2);
        
        timeInicio = System.currentTimeMillis(); 
        if(Busca.buscaBinaria(vetor2, x,inicio,fim))
            System.out.println(x + " existe no vetor;");
        else
            System.out.println(x + " não existe no vetor;");
        
        timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio));
    }
}
