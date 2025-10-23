/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class AireCondicionado{ 
    private String marca;
    private String color;
    private double tamaño;

    public AireCondicionado(String marca, String color, double tamaño){
        this.marca=marca;
        this.color=color;
        this.tamaño=tamaño;
    }

    public void encender(){}
    public void apagar(){}
    public void cambiarTemperatura(){}

    public static void main(String[] args){
    AireCondicionado aire1 = new AireCondicionado("LG", "Blanco", 12);
    AireCondicionado aire2 = new AireCondicionado("Samsung", "Blanco", 18);
    AireCondicionado aire3 = new AireCondicionado("Midea", "Blanco", 24);
    AireCondicionado aire4 = new AireCondicionado("Challenger", "Blanco", 30);
    AireCondicionado aire5 = new AireCondicionado("Carrier", "Blanco", 36);
    }
}
