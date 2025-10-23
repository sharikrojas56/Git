/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class AntenaWifi {
    private String marca;
    private String tamaño;

    
    public AntenaWifi(String marca, String tamaño){
        this.marca=marca;
        this.tamaño=tamaño;

    }
    public void conectar(){}
    public void desconectar(){}

    public static void main(String[] args){
        AntenaWifi antena1 = new AntenaWifi("TP-Link", "Pequeña");
        AntenaWifi antena2 = new AntenaWifi("Netgear", "Mediana");
        AntenaWifi antena3 = new AntenaWifi("D-Link", "Grande");
        AntenaWifi antena4 = new AntenaWifi("Asus", "Pequeña");
        AntenaWifi antena5 = new AntenaWifi("Linksys", "Mediana");
    }
}
