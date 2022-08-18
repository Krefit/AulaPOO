/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n1_buscaordenacao;

import java.util.Random;

/**
 *
 * @author gusta
 */
public class N1_BuscaOrdenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int geraNumeroRandom(int limiteInferior, int limiteSuperior){
        Random r = new Random(); //cria novo numero random
        //System.out.println(r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior);
        int saida = r.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior; //fórmula para gerar o número entre os limites informados
        System.out.print(saida + ", ");
        return saida;
        
    }
    
}
