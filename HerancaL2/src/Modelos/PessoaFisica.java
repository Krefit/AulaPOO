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
public class PessoaFisica extends Pessoa{
    
    protected String CPF = "";
    protected String sexo = "";
    
    ;
    /*
    protected String nome = "";
    protected String endereco = "";
    protected String telefone = "";
    protected String email = "";
    protected float rendaBruta = 0;
    */
    public PessoaFisica(){
    };
    
    
    public PessoaFisica(String nome, String endereco, String telefone, String email, float rendaBruta, String CPF, String sexo) throws Exception{
        super(nome,endereco,telefone,email,rendaBruta);
        this.CPF = CPF;
        this.sexo = sexo;
    }
    
    @Override
    public float calculaImpostoRenda(){
        
  
        if(this.rendaBruta <=1400f)
            return 0;
        else 
            if(this.rendaBruta <= 2100f)
                return this.rendaBruta * 0.1f;
            else 
                if(this.rendaBruta <=2800f)
                    return this.rendaBruta * 0.15f;
                else 
                    if(this.rendaBruta <= 3600f)
                        return this.rendaBruta * 0.25f;
                    else 
                        if(this.rendaBruta > 3600)
                            return this.rendaBruta * 0.3f;
        
        
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nPessoaFisica{" + "\nCPF=" + CPF + ",\n sexo=" + sexo + '}';
    }
    
    
}
