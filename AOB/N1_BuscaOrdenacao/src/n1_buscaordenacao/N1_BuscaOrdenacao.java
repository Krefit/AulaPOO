/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n1_buscaordenacao;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Clock;
import java.util.Random;
import persistencia.Busca;

/**
 *
 * @author gusta
 */
public class N1_BuscaOrdenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        // TODO code application logic here
        
        int tamanhoVetor = 0;
        //Ler arquivo TXT:
        String nomeArquivo = "ArquivoTeste.txt";//"Dicionario.txt";
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = br.readLine();//lê primeira linha (tamanho vetor)
        tamanhoVetor = Integer.parseInt(linha);       
        
        String vetorSaida[] = new String[tamanhoVetor];
        
        Busca.preencheVetor(vetorSaida);
        
//        for(int cont = 0;cont<vetorSaida.length;cont++)
//            System.out.println(vetorSaida[cont]);
        long timeInicio = System.currentTimeMillis();
        //String novoVetor[] = Busca.ordSelectSort(vetorSaida);
        String novoVetor[] = Busca.ordBubbleSort(vetorSaida);
        long timeFim = System.currentTimeMillis();
        System.out.println("Tempo de execução:" + (timeFim-timeInicio)); // termina de contar o tempo
        
        for(int cont = 0;cont<novoVetor.length;cont++)
            System.out.println(novoVetor[cont]);
    }
    
    
}
