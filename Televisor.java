/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Televisor {
    private String color;
    private String marca;
    private String tamaño;
    private int cantentrada;

    public Televisor(String color, String marca, String tamaño, int cantentrada){
        this.color=color;
        this.marca=marca;
        this.tamaño=tamaño;
        this.cantentrada=cantentrada;
    }

    public static void encender(){};
    public static void apagar(){};

    public static void main(String[] args){
    Televisor televisor1 = new Televisor("Negro", "Samsung", "32 Pulgadas", 3);
    Televisor televisor2 = new Televisor("Negro", "LG", "40 Pulgadas", 4);
    Televisor televisor3 = new Televisor("Negro", "Sony", "50 Pulgadas", 5);
    Televisor televisor4 = new Televisor("Negro", "Toshiba", "60 Pulgadas", 6);
    Televisor televisor5 = new Televisor("Negro", "Challenger", "70 Pulgadas", 7);

    }
}
