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
abstract public class Produto {
    private int codigo = 0;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    abstract public String obtemDescricao();
    abstract public int obtemPreco();
    abstract public String obtemTipoProduto();
}
