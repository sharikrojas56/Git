/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambiente2091;

/**
 *
 * @author user
 */
public class Aprendiz {
     private String nombre;
    private String Genero;
    private String Altura;
    private double peso;
    private int edad;
    private String programa;
    
    public Aprendiz(String nombre, String Genero, String Altura, double peso, int edad, String programa){
        this.nombre=nombre;
        this.Genero=Genero;
        this.Altura=Altura;
        this.peso=peso;
        this.edad=edad;
        this.programa=programa;
    }

    public void estudiar(){}


    public static void main(String[] args){
        Aprendiz aprendiz1 = new Aprendiz("Carlos", "Masculino", "1.75m", 70.5, 20, "Programación");
        Aprendiz aprendiz2 = new Aprendiz("Ana", "Femenino", "1.65m", 60.0, 22, "Programación");
        Aprendiz aprendiz3 = new Aprendiz("Luis", "Masculino", "1.80m", 80.0, 21, "Programación");
        Aprendiz aprendiz4 = new Aprendiz("María", "Femenino", "1.70m", 55.0, 23, "Programación");
        Aprendiz aprendiz5 = new Aprendiz("Jorge", "Masculino", "1.78m", 75.0, 24, "Programación");    
        
    }
}
