/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.netbeansgit;

/**
 *
 * @author pepeponpin
 */
public class prueba2 {
    private int dato1;
    private double dato2;
    private String saludo = "hola soy editado desde un pull de github";

    public prueba2(int dato1, double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public int getDato1() {
        return dato1;
    }

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    @Override
    public String toString() {
        return "prueba2{" + "dato1=" + dato1 + ", dato2=" + dato2 +" saludo= "+ saludo +'}';
    }
    
}
