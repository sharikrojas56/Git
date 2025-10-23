/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Tablero {
    private String color;
    private double tamaño;
    private String Forma;
    private String material;
    private String Marca;
    
    public Tablero(String color, double tamaño, String Forma, String material, String Marca){
        this.color=color;
        this.tamaño=tamaño;
        this.Forma=Forma;
        this.material=material;
        this.Marca=Marca;
    }
    
    public static void main(String[] args){
    Tablero tablero1 = new Tablero("Blanco", 10, "Rectangular", "Madera", "SENA");
    Tablero tablero2 = new Tablero("Blanco", 10, "Rectangular", "Madera", "SENA");
    Tablero tablero3 = new Tablero("Blanco", 10, "Rectangular", "Madera", "SENA");
    Tablero tablero4 = new Tablero("Blanco", 10, "Rectangular", "Madera", "SENA");
    Tablero tablero5 = new Tablero("Blanco", 10, "Rectangular", "Madera", "SENA");

     }
}
