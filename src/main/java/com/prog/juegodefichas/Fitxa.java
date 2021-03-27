/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prog.juegodefichas;

/**
 *
 * @author tomeu
 */
public abstract class Fitxa {
    //atributs
    private String color;
    private Casella fila;
    private Casella columna;
    
    //Guarda el color dins l'atribut
    public void setColor (String color){
        this.color = color;
    }
    //Mètode que retorna el valor de color
    public String getColor () {
        return color;
    }
    
    public abstract boolean moureA(Casella c); 
    
}
