/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Locker {
    private double tamaño;
    private String color;
    private String material;
    private int numeroDePuertas;

    public Locker(double tamaño, String color, String material, int numeroDePuertas){
        this.tamaño=tamaño;
        this.color=color;
        this.material=material;
        this.numeroDePuertas=numeroDePuertas;
    }

    public void abrir(){}
    public void cerrar(){}

    public static void main(String[] args){
        Locker locker1 = new Locker(20, "Gris", "Metal", 4);
        Locker locker2 = new Locker(20, "Gris", "Metal", 4);
        Locker locker3 = new Locker(20, "Gris", "Metal", 4);
        Locker locker4 = new Locker(20, "Gris", "Metal", 4);
        Locker locker5 = new Locker(20, "Gris", "Metal", 4);
 }
}
