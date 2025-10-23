/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Soportetv {
    private double tamaño;
    private String color;
    private int numeroDeRuedas;


    public Soportetv(double tamaño, String color, int numeroDeRuedas){
        this.tamaño=tamaño;
        this.color=color;
        this.numeroDeRuedas=numeroDeRuedas;
    }

    public void mover(){}

    public static void main(String[] args){
        Soportetv soporte1 = new Soportetv(32, "Negro", 4);
        Soportetv soporte2 = new Soportetv(40, "Blanco", 4);
        Soportetv soporte3 = new Soportetv(50, "Gris", 4);
        Soportetv soporte4 = new Soportetv(60, "Negro", 4);
        Soportetv soporte5 = new Soportetv(70, "Plateado", 4);
    }
}
