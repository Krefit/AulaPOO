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
        int contador = 0; // inicia variavel contador
        for(contador = 0;contador < vet.length;contador++) // PARA(contador = 0; faça enquanto contador < tamanhoVetor)
        {
            if(x == vet[contador])//Se o vetor na posição do contador for igual ao numero procurado retorna true.
                return true;
        }
        return false; // senão retorna false
    }
    
    public static boolean buscaBinaria(int vet[], int x, int inicio, int fim){
        int meio = 0; // inicia vetor que vai verificar o "meio" do vetor"
        if(inicio > fim) //se o inicio for maior que o fim, não tem como verificar pois o vetor não está ordenado
            return false;
        
        meio  = (inicio + fim)/2; //meio recebe a soma do (inicio+fim)/2
        
        if(x == vet[meio]) // se o valor procurado for igual ao valor do vetor na posição meio, retorna true
            return true;
        else if (x < vet[meio]) // senão se o numero procurado for MENOR que valor do vetor na posição meio,
            return (buscaBinaria(vet,x, inicio, meio-1)); //refaz busca passando o vetor do inicio até posição meio-1
        else //senão, caso o valr procurado seja MAIOR que o valor do vetor na posição meio
            return (buscaBinaria(vet,x,meio+1,fim));   //refaz a busca passando o vetor da posiçao meio+1 até o fim
    }
    
    public static int[] ordSelectSort(int vet[]){
        int vetOrdenado[] = vet;//cria vetor auxiliar para ordenar o vetor passado
        
        for(int cont=0;cont < vetOrdenado.length-2;cont++) //FAÇA contador=0 até contador menor que o tamanho do vetor -2
        {
            /*
            Esse primeiro loop vai olhar até a penúltima posição, por isso o -2
            O loop seguinte ira olhar o até a última posição, por isso o -1
            */
            int min =cont; //segura a posição do contador como "a menor"
            for(int cont2 = cont+1;cont2 < vetOrdenado.length-1;cont2++)
            {
                if(vetOrdenado[cont2] < vetOrdenado[min]){ //se o vetor na posição cont2 for menor q o vetor na posição min
                    min = cont2; //então min recebe a posição do menor valor.
                }
            }
            int cont3 = vetOrdenado[min]; //cont3 é uma variavel auxiliar para fazer as trocas dos valores
            //por isso recebe o valor do vetor na posição min.
            
            vetOrdenado[min] = vetOrdenado[cont]; //vetor na posição min recebe o valor do vetor na posição cont
            vetOrdenado[cont] = cont3; //vetor cont recebe o valor do maior número comparado
        }
        return vetOrdenado;
    }
    
    public static int sorteia(int limiteInferior, int limiteSuperior){
        Random r = new Random(); //cria novo numero random
        //System.out.println(r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
        int saida = r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior; //fórmula para gerar o número entre os limites informados
        System.out.print(saida + ", ");
        return saida;
        
    }
    /*Faça um programa que preencha aleatoriamente (veja o método 'sorteia' abaixo) um vetor de 100.000 posições com 
    elementos entre 1 e 1.000.000 e realize a Busca Sequencial e Binária por um elemento aleatório (sorteado também pelo método sorteia)
    neste vetor. Compute o tempo de busca de ambos os métodos (System.currentTimeMillis() - milisegundos ou System.nanoTime() - nanosegundos) e 
    verifique qual obteve melhor desempenho.Obs. para execução da Busca Binária, lembrem-se que necessário a ordenação do vetor, para tal
    utilize o método do SelectionSort apresentado em sala de aula para ordená-lo.*/
    
    
}

