/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Impresora {
    private String marca;
    private String color;
    private double tamaño;

    public Impresora(String marca, String color, double tamaño){
        this.marca=marca;
        this.color=color;
        this.tamaño=tamaño;
    }

    public void encender(){}
    public void apagar(){}
    public void imprimir(){}
    

    public static void main(String[] args){
        Impresora impresora1 = new Impresora("HP", "Blanco", 15);
        Impresora impresora2 = new Impresora("Canon", "Negro", 20);
        Impresora impresora3 = new Impresora("Epson", "Gris", 25);
        Impresora impresora4 = new Impresora("Brother", "Blanco", 30);
        Impresora impresora5 = new Impresora("Lexmark", "Negro", 35);
    }
}
