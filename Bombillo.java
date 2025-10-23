/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Bombillo {
    private double tamaño;
    private String forma;
    private String estado;
    private String calidadLuz;

    public Bombillo(double tamaño, String forma, String estado, String calidadLuz){
        this.tamaño=tamaño;
        this.forma=forma;
        this.estado=estado;
        this.calidadLuz=calidadLuz;
    }

    public void encender(){}
    public void apagar(){}

    public static void main(String[] args){
        Bombillo bombillo1 = new Bombillo(5.5, "Cuadrado", "Apagado", "Cálida");
        Bombillo bombillo2 = new Bombillo(7.0, "Cuadrado", "Encendido", "Fría");
        Bombillo bombillo3 = new Bombillo(6.0, "Cuadrado", "Apagado", "Neutra");
        Bombillo bombillo4 = new Bombillo(8.0, "Cuadrado", "Apagado", "Cálida");
        Bombillo bombillo5 = new Bombillo(4.5, "Cuadrado", "Encendido", "Fría");
    }
}
