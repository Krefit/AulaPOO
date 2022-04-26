/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelos.Cliente;
import java.util.ArrayList;
/**
 *
 * @author Gustavo.Santos
 */
public interface IClienteDao {
    void incluir(Cliente objeto) throws Exception;
    void alterar(Cliente objeto) throws Exception;
    Cliente consultar(int ID) throws Exception;
    void excluir(int ID) throws Exception;
    ArrayList<Cliente> obterClientes() throws Exception;
}
