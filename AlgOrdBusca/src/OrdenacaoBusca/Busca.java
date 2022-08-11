/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenacaoBusca;

import java.util.Random;

/**
 *
 * @author gusta
 */
public class Busca {
    public static boolean buscaSeq(int vet[], int x){
        int contador = 0;
        for(contador = 0;contador < vet.length;contador++)
        {
            if(x == vet[contador])
                return true;
        }
        return false;
    }
    
    public static boolean buscaBinaria(int vet[], int x, int inicio, int fim){
        int meio = 0;
        if(inicio > fim)
            return false;
        
        meio  = (inicio + fim)/2;
        
        if(x == vet[meio])
            return true;
        else if (x < vet[meio])
            return (buscaBinaria(vet,x, inicio, meio-1));
        else
            return (buscaBinaria(vet,x,meio+1,fim));        
    }
    
    public static int[] ordSelectSort(int vet[]){
        int vetOrdenado[] = vet;
        
        for(int cont=0;cont < vetOrdenado.length-2;cont++)
        {
            int min =cont;
            for(int cont2 = cont+1;cont2 < vetOrdenado.length-1;cont2++)
            {
                if(vetOrdenado[cont2] < vetOrdenado[min]){
                    min = cont2;
                }
            }
            int cont3 = vetOrdenado[min];
            
            vetOrdenado[min] = vetOrdenado[cont];
            vetOrdenado[cont] = cont3;
        }
        return vetOrdenado;
    }
    
    public static int sorteia(int limiteInferior, int limiteSuperior){
        Random r = new Random();
        //System.out.println(r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
        return r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        
    }
    /*Faça um programa que preencha aleatoriamente (veja o método 'sorteia' abaixo) um vetor de 100.000 posições com 
    elementos entre 1 e 1.000.000 e realize a Busca Sequencial e Binária por um elemento aleatório (sorteado também pelo método sorteia)
    neste vetor. Compute o tempo de busca de ambos os métodos (System.currentTimeMillis() - milisegundos ou System.nanoTime() - nanosegundos) e 
    verifique qual obteve melhor desempenho.Obs. para execução da Busca Binária, lembrem-se que necessário a ordenação do vetor, para tal
    utilize o método do SelectionSort apresentado em sala de aula para ordená-lo.*/
    
    
}

