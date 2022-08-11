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
        int x = 4;
        
        while(cont < vetor.length){
            vetor[cont] = Busca.sorteia(1,1000000);
            cont++;
        }
        
        
        long timeInicio = System.currentTimeMillis();       
        
        if(Busca.buscaSeq(vetor, x))
            System.out.println(x + " existe no vetor;");
        else
            System.out.println(x + " não existe no vetor;");
        
        long timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio));
    }
}
