/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    
    public static String[] ordSelectSort(String vet[]){
        String vetOrdenado[] = vet;//cria vetor auxiliar para ordenar o vetor passado
        
        for(int cont=0;cont < vetOrdenado.length-1;cont++) //FAÇA contador=0 até contador menor que o tamanho do vetor -2
        {
            
            int min =cont; 
            for(int cont2 = cont+1;cont2 < vetOrdenado.length;cont2++)
            {
                if(vetOrdenado[cont2].length() < vetOrdenado[min].length()){ 
                    min = cont2; 
                }
            }
            String cont3 = vetOrdenado[min]; 
            
            vetOrdenado[min] = vetOrdenado[cont]; 
            vetOrdenado[cont] = cont3; 
        }
        return vetOrdenado;
    }
    
    public static String[] ordBubbleSort(String vet[]){
        String vetOrdenado[] = vet;
        String aux = "";
        
        for(int cont =vet.length-1;cont>=1;cont--){
            for(int cont2 = 1;cont2<=cont;cont2++){
                if(vet[cont2-1].length()>vet[cont2].length()){
                    aux = vet[cont2-1];
                    vet[cont2-1] = vet[cont2];
                    vet[cont2]=aux;
                }
            }
        }
        
        return vetOrdenado;
    }
    
    public static String[] ordInsertionSort(String vet[]){
        String vetOrdenado[] = vet;
        int aux = 0;
        
        for(int i = 1;i<=vetOrdenado.length-1;i++){
            String auxV = vetOrdenado[i];
            aux = i;
            while((aux>0) && (vetOrdenado[aux-1].length()>auxV.length())){
                vetOrdenado[aux] = vetOrdenado[aux-1];
                aux = aux-1;
            }
            vetOrdenado[aux] = auxV;
        }
        
        return vetOrdenado;
    };
    
    public static String[] ordMergeSort(String vet[]){
        String vetOrdenado[] = vet;
        int aux = 0;
        
        for(int i =0;i<=vetOrdenado.length;i++){
            
        }
        
        return vetOrdenado;
    };
    
    public static int/*[]*/ ordQuickSort(){
        return 0;
    };
    
    public static int[] preencheVetor(String[] vetor) throws FileNotFoundException, Exception{
        
        FileReader fr = new FileReader("ArquivoTeste.txt");
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        int contador = 0;
        
        while ((linha = br.readLine()) != null){
            if(contador > 0)
                vetor[contador-1] = linha;
            
            contador++;
        }
        
        int vetorSaida[] = new int[0];
        return vetorSaida;
    }
    
}

