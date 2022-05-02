/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelos.Cliente;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gustavo.Santos
 */
public class ClienteDao implements IClienteDao {

    private String nomeArquivoDisco = "Cliente.txt";

    @Override
    public void incluir(Cliente objeto) throws Exception {
        try {
            int id = GeradorIdentificador.getID();
            objeto.setId(id);
            //cria arquivo CLIENTE
            FileWriter fw = new FileWriter(nomeArquivoDisco, true);//true = acumular
            //cria buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //escreve arquivo
            bw.write(objeto.toString() + "\n");
            //fecha arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente consultar(int ID) throws Exception {
        try {
            FileReader fr = new FileReader(nomeArquivoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cliente objetoCliente = new Cliente();
                String vetorString[] = linha.split(";");
                if (vetorString.length != 5) {
                    throw new Exception("Faltam dados na String");
                }
                //[ID][Nome][Telefone][Email][Endereco]
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setNomeCompleto(vetorString[1]);
                objetoCliente.setTelefone(Integer.parseInt(vetorString[2]));
                objetoCliente.setEmail(vetorString[3]);
                objetoCliente.setEndereco(vetorString[4]);
                if (objetoCliente.getId() == ID) {
                    br.close();
                    return objetoCliente;
                }
            }
            br.close();
            throw new Exception("ID NÃO EXISTE");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void excluir(int ID) throws Exception {
        try {
            ArrayList<Cliente> listaCliente = null;// Cria lista vazia
            listaCliente = obterClientes();//Popular a lista com os Clientes
            FileWriter fw = new FileWriter(nomeArquivoDisco);
            //cria buffer
            BufferedWriter bw = new BufferedWriter(fw);
            int contDeletado = 0;
            //escreve arquivo
            for(int pos=0;pos<listaCliente.size()/*tamanho da lista*/;pos++){
                if(listaCliente.get(pos).getId() != ID)
                    bw.write(listaCliente.get(pos).toString() + "\n");
                else
                    contDeletado++;
            }
            if(contDeletado == 0)
                throw new Exception("ID NÃO ENCONTRADO!");
            bw.close();    
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Cliente> obterClientes() throws Exception {
        try {
            ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
            FileReader fr = new FileReader(nomeArquivoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cliente objetoCliente = new Cliente();
                String vetorString[] = linha.split(";");
                //[ID];[Nome];[Telefone];[Email];[Endereco]
                if (vetorString.length != 5) {
                    throw new Exception("Faltam dados na String");
                }
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setNomeCompleto(vetorString[1]);
                objetoCliente.setTelefone(Integer.parseInt(vetorString[2]));
                objetoCliente.setEmail(vetorString[3]);
                objetoCliente.setEndereco(vetorString[4]);
                listaClientes.add(objetoCliente);
            }
            br.close();
            return listaClientes;

        } catch (Exception erro) {
            throw erro;
        }

    }

}
