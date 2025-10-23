/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Puerta {
    private String color;
    private String tipo;
    private double tamaño;

    public Puerta(String color, String tipo, double tamaño){
        this.color=color;
        this.tipo=tipo;
        this.tamaño=tamaño;
    }

    public void abrir(){}
    public void cerrar(){}

    public static void main(String[] args){
    Puerta puerta1 = new Puerta("Gris", "Vidrio", 2);
    Puerta puerta2 = new Puerta("Gris", "Vidrio", 2);
    Puerta puerta3 = new Puerta("Gris", "Vidrio", 2);
    Puerta puerta4 = new Puerta("Gris", "Vidrio", 2);
    Puerta puerta5 = new Puerta("Gris", "Vidrio", 2);
    }
}
