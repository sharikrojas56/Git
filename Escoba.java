/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Escoba {
    private String material;
    private String color;

    public Escoba(String material, String color){
        this.material=material;
        this.color=color;
    }

    public void barrer(){}

    
    public static void main(String[] args){
        Escoba escoba1 = new Escoba("Madera", "Rojo");
        Escoba escoba2 = new Escoba("Plástico", "Azul");
        Escoba escoba3 = new Escoba("Madera", "Verde");
        Escoba escoba4 = new Escoba("Madera", "Amarillo");
        Escoba escoba5 = new Escoba("Fibra", "Negro");
}
}
