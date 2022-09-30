/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author gusta
 */
public class Veiculo {
    private long ID;
    private String placa;
    private String chassi;
    private String renavan;
    private Date anoFabricacao;
    private String cor;
    private float km;
    private Status status;
    private Modelo modelo;
    private List<Opcional> listAcessorio;
    private List<Locacao> listLocacao;
}
