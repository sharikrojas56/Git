/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class CableVideo {
     private double longitud;
    private String tipo;
    private String estado;
    private String marca;
    

    public CableVideo(double longitud, String tipo, String estado, String marca){
        this.longitud=longitud;
        this.tipo=tipo;
        this.estado=estado;
        this.marca=marca;
    }

    public void conectar(){}
    public void desconectar(){}

    public static void main(String[] args){
        CableVideo cable1 = new CableVideo(1.5, "HDMI", "Nuevo", "Sony");
        CableVideo cable2 = new CableVideo(2.0, "VGA", "Usado", "Samsung");
        CableVideo cable3 = new CableVideo(3.0, "DVI", "Nuevo", "LG");
        CableVideo cable4 = new CableVideo(1.0, "DisplayPort", "Usado", "Dell");
        CableVideo cable5 = new CableVideo(2.5, "Thunderbolt", "Nuevo", "Apple");
    }
}
