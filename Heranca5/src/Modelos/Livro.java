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
public class Livro extends Produto{
    
    public Livro(int codigo, String titulo){
        super(codigo);
        this.titulo = titulo;
    }
    
    //✓Livro – título, autor, tradutor, editora e ano de publicação.
    
    protected String titulo = "";
    protected String autor = "";
    protected String tradutor = "";
    protected String editora = "";
    protected int anoProducao = 0;
    
    
    
    @Override
    public String obtemDescricao(){
        String retorno = "";
        return retorno;
    }
    
    @Override
    public float obtemPreco()
    {
        return 0f;
    }
    
    @Override
    public String obtemTipoProduto(){
        return "Livro";
    }
}
