/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Silla {
    private String color;
    private double tamaño;
    private String material;
    private String tipo;
    private String estado;
    

    public Silla(String color,double tamaño, String tipo,  String material, String estado){
        this.color=color;
        this.tamaño=tamaño;
        this.tipo=tipo;
        this.material=material;
        this.estado=estado;
    }

    public void mover(){}

    public static void main(String[] args){
    Silla silla1 = new Silla("Negro", 10, "No se ", "Instructor", "Bien");
    Silla silla2 = new Silla("Verde", 10, "Acolchado","Aprendiz", "Bien");
    Silla silla3 = new Silla("Azul", 10, "Acolchado","Aprendiz", "Bien");
    Silla silla4 = new Silla("Rojo", 10, "Acolchado","Aprendiz", "Dañada");
    Silla silla5 = new Silla("Marron", 10, "Acolchado","Aprendiz", "Dañada");
    }
}
