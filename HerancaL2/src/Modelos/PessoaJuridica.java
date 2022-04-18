/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author gusta
 */
public class PessoaJuridica extends Pessoa{
    //CNPJ, razão social, calcular imposto de renda.
    
    protected String CNPJ = "";
    protected String razaoSocial = "";
    
    public PessoaJuridica(){
        
    }
    
    public PessoaJuridica(String nome, String endereco, String telefone, String email, float rendaBruta, String CNPJ, String razaoSocial) throws Exception{
        super(nome, endereco, telefone, email, rendaBruta);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nPessoaJuridica{" + "\nCNPJ=" + CNPJ + ", \nrazaoSocial=" + razaoSocial + '}';
    }
    
    
    
    @Override
    public float calculaImpostoRenda(){
        return this.rendaBruta * 0.2f;
    }
}
