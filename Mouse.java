/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Mouse {
    private String color;
    private String marca;
    private String modelo;
    private String estado;
    private String tipo;

    public Mouse(String color, String marca, String modelo, String estado, String tipo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.estado=estado;
        this.tipo=tipo;
    }

    public void click(){}

    public static void main(String[] args){
    Mouse mouse1 = new Mouse("Negro", "Lenovo", "M100", "Bien", "Alámbrico");
    Mouse mouse2 = new Mouse("Negro", "Lenovo", "M100", "Bien", "Alámbrico");
    Mouse mouse3 = new Mouse("Negro", "Lenovo", "M100", "Dañado", "Alámbrico");
    Mouse mouse4 = new Mouse("Negro", "Lenovo", "M100", "Bien", "Alámbrico");
    Mouse mouse5 = new Mouse("Negro", "Lenovo", "M100", "Dañado", "Alámbrico");

}
}
