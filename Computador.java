/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Computador {
    private String color;
    private String tipo;
    private String marca;
    private String modelo;
    private String estado;
    private String procesador;
    private int ram;


    
    public Computador(String color, String tipo, String marca, String modelo, String estado, String procesador, int ram){
        this.color=color;
        this.tipo=tipo;
        this.marca=marca;
        this.modelo=modelo;
        this.estado=estado;
        this.procesador=procesador;
        this.ram=ram;
    }
    
    public void encender(){}
    public void apagar(){}
    public void reiniciar(){}

    public static void main(String[] args){
        Computador computador1 = new Computador("Gris", "Portatil", "HP", "240 G8", "Bien", "Intel Core i5", 8);
        Computador computador2 = new Computador("Gris", "PC todo en uno", "HP","240 G8", "Bien", "Intel Core i7", 16);
        Computador computador3 = new Computador("Gris", "Portatil", "HP", "240 G8", "Dañada", "Intel Core i5", 8);
        Computador computador4 = new Computador("Gris", "Portatil", "HP", "240 G8", "Bien", "Intel Core i5", 8);
        Computador computador5 = new Computador("Gris", "Portatil", "HP", "240 G8", "Bien", "Intel Core i5", 8);
    
    }
}
