/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Multitoma {
    private double tamaño;
    private String estado;
    private int numeroDeTomas;

    public Multitoma(double tamaño, String estado, int numeroDeTomas){
        this.tamaño=tamaño;
        this.estado=estado;
        this.numeroDeTomas=numeroDeTomas;
    }

    public void conectar(){}
    public void desconectar(){}
    
    
    public static void main(String[] args){
        Multitoma multitoma1 = new Multitoma(15.0, "Desconectada", 4);
        Multitoma multitoma2 = new Multitoma(20.0, "Conectada", 6);
        Multitoma multitoma3 = new Multitoma(10.0, "Desconectada", 3);
        Multitoma multitoma4 = new Multitoma(25.0, "Conectada", 8);
        Multitoma multitoma5 = new Multitoma(30.0, "Desconectada", 5);
    }
}
