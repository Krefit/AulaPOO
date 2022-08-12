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
        
        while(cont < vetor.length){
            vetor[cont] = Busca.sorteia(inicio,fim);
            cont++;
            if(cont%100 == 0)
                System.out.println("");
        }
        int vetor2[] = vetor; //copia o vetor para dentro do vetor2 para "comparar" depois.
        
        vetor2 = Busca.ordSelectSort(vetor2); // ordenando o vetor 2
        
        
        long timeInicio = System.currentTimeMillis();    //começa a contar o tempo   
        
        if(Busca.buscaSeq(vetor, x)) //chama metodo que busca o valor X no vetor (retorna true ou false)
            System.out.println(x + " existe no vetor;");
        else
            System.out.println(x + " não existe no vetor;");
        
        long timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio)); // termina de contar o tempo
        /*------------------------------------------------------*/
        /*------------------------------------------------------*/
        /*------------------------------------------------------*/       
        
        timeInicio = System.currentTimeMillis(); //começa a contar o tempo
        if(Busca.buscaBinaria(vetor2, x,inicio,fim)) //chama metodo que busca valor no vetor2 (retorna true ou false)
            System.out.println(x + " existe no vetor;");
        else
            System.out.println(x + " não existe no vetor;");
        
        timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio)); //termina de contar o tempo
    }
}
