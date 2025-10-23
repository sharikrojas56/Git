/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Teclado {
    private String marca;
    private double tamaño;
    private String estado;

    public Teclado(String marca, String estado, double tamaño){
        this.marca=marca;
        this.estado=estado;
        this.tamaño=tamaño;
    }

    public void conectar(){}
    public void desconectar(){}
    public void escribir(){}

    public static void main(String[] args){
        Teclado teclado1 = new Teclado("Logitech", "Bien", 15.5);
        Teclado teclado2 = new Teclado("Microsoft", "Excelente", 14.0);
        Teclado teclado3 = new Teclado("Razer", "Bueno", 16.0);
        Teclado teclado4 = new Teclado("Corsair", "Regular", 15.0);
        Teclado teclado5 = new Teclado("HP", "Malo", 13.5);
        
    }
}
