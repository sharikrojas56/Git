/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Mesa {
    private String color;
    private String tipo;
    private double tamano;
    private String forma;
    private String material;
    private int cantpersonas;
    private String estado;

    public Mesa(String color, String tipo, double tamano, String forma, String material, int cantpersonas, String estado){
        this.color=color;
        this.tipo=tipo;
        this.tamano=tamano;
        this.forma=forma;
        this.material=material;
        this.cantpersonas=cantpersonas;
        this.estado=estado;
    }

    public static void main(String[] args){
    Mesa mesa1 = new Mesa("Marron", "Aprendiz", 20, "Hexagonal", "Madera", 5 , "Bien");
    Mesa mesa2 = new Mesa("Rojo", "Aprendiz", 20, "Hexagonal", "Madera", 5 , "Bien");
    Mesa mesa3 = new Mesa("Verde", "Aprendiz", 20, "Hexagonal", "Madera", 5 , "Bien");
    Mesa mesa4 = new Mesa("Gris", "Instructor", 10, "Rectangulas", "Madera", 1 , "Bien");
    Mesa mesa5 = new Mesa("Blanco", "Objetos", 10, "Rectangular", "Madera", 1 , "Bien");

    }
}
