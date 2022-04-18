/*
O conjunto dos números naturais é representado pela letra maiúscula N.
O conjunto N é formado pelos números inteiros que vão de 0 a +∞.
Todo número natural é seguido, imediatamente após, por outro número natural
chamado sucessor, ou seja: N = {0,1,2,3,4,...}.
O símbolo N* é usado para indicar o conjunto de números naturais não-nulos, ou
seja:

N* = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...}
Sobre os números naturais podemos:
✓ Calcular seu Fatorial; OK
✓ Saber se é um Número Perfeito; OK
✓ Saber se é Capicua; OK
✓ Saber se é Quadrado Perfeito; OK
✓ Saber se é um Número Primo; OK
✓ Mudar este da base 10 para base n, onde n pode se 2,8,16;
✓ Calcular o Máximo Divisor Comum entre ele e outro número natural; OK
✓ Calcular o Mínimo Múltiplo Comum entre ele e outro número natural; 
✓ Calcular se ele e outro número natural são primos entre si;
 */
package Modelos.Classes;

import Modelos.Interface.INNatural;

/**
 *
 * @author gusta
 */
public class NNatural implements INNatural{
    private int numero = 0;

    public NNatural() {
    }
    
    public NNatural(int numero) throws Exception {
        if(numero < 0) throw new Exception("Numero não pode ser negativo!");
        
        this.numero = numero;
    }
    
    public NNatural(NNatural objeto){
        numero = objeto.numero;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) throws Exception {
        if(numero < 0) throw new Exception("Numero não pode ser negativo!");
        this.numero = numero;
    }

    @Override
    public void setNumero(NNatural objeto) {
        this.numero = objeto.numero;
    }

    @Override
    public boolean eNumeroQuadradoPerfeito() {
        int auxiliar = (int) Math.sqrt(numero);
        if((auxiliar * auxiliar) == numero)
            return true;
        else 
            return false;   
    }

    @Override
    public NNatural calcularFatorial() throws Exception{
        int n = numero;
        int  fat = 1;
        
        while(n>1){
            fat *= n;
            n--;
        }
        return new NNatural(fat);
    }

    @Override
    public boolean eNumeroPerfeito() {     
        int numAux = numero;
        int resto = 0;
        int aux = 1;
        int SomaDivisores = 0;
        
        while(aux < numAux)
        {
            resto = numAux%aux;
            if(resto == 0)
                SomaDivisores = SomaDivisores + aux;
            aux++;
        }
        return SomaDivisores == numAux;
    }

    @Override
    public boolean eCapicua() {
        int aux = 0;
        int numDado = numero;
        int numeroSaida = 0;
        int tamanhoNumero = String.valueOf(numero).length();
        for (int i = tamanhoNumero-1; i >= 0; i--) {
            aux = (numDado%10);
            numDado = numDado/10;
            numeroSaida = (int) (aux*(Math.pow(10, i)))+numeroSaida;
        }
        return numero == numeroSaida;   
    }

    @Override
    public boolean ePrimo() {
        int numAux = numero;
        int cont = 2;
        while(cont < numAux)
        {
            if(numAux%cont == 0)
                return false;                
            cont++;
        }
        return true;
    }
//m*10 + aux%10
//aux/=10;    
    @Override
    public NNatural calcularMMC(NNatural num2) throws Exception{
        //ir do menor numero a 0 e verificando se divide os 2 valores.
        //n1  * n2 / mdc = mmc
        int mmc = 0;
        int num1 = numero;
        int numero2 = num2.numero;
        mmc = (num1*numero2);
        mmc = mmc/calcularMDC(num2).numero;
        
        return new NNatural(mmc);
    }

    @Override
    public NNatural calcularMDC (NNatural num2) throws Exception {
        int num1 = numero;
        int numero2 = num2.numero;
        
        while(num1 % numero2 != 0){
            int resto = num1%numero2;
            num1 = numero2;
            numero2 = resto;
        }
        return new NNatural(numero2);
    }

    @Override
    public String mudarBase(int base) {
        int num = numero;
        String aux = "";
        String vetor = "0123456789ABCDEFGHIJKLMNOPQRSTUVXZ";
        while(num>0)
        {
            aux = vetor.charAt((int)num%base)+ aux;
            num /= base;
        }
        return aux;
    }


    
    
    
}
