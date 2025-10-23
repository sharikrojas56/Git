/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Cargador {
    private String color;
    private String marca;
    private String modelo;
    private String estado;
    private String tipo;

    public Cargador(String color, String marca, String modelo, String estado, String tipo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.estado=estado;
        this.tipo=tipo;
    }

    public static void conectar(){};
    public static void cargar(){};
    public static void desconectar(){};

    public static void main(String[] args){
        Cargador cargador1 = new Cargador("Negro", "HP", "240 G8", "Dañado", "Alámbrico");
        Cargador cargador2 = new Cargador("Negro", "HP", "240 G8", "Bien", "Alámbrico");
        Cargador cargador3= new Cargador("Negro", "HP", "240 G8", "Bien", "Alámbrico");
        Cargador cargador4 = new Cargador("Negro", "HP", "240 G8", "Bien", "Alámbrico");
        Cargador cargador5 = new Cargador("Negro", "HP", "240 G8", "Dañado", "Alámbrico");

}
}
