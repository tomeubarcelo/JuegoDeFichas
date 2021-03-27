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
public class Fitxa {
    //atributs
    private String color;
    private Casella fila;
    private Casella columna;
    private final Casella casella = new Casella(0, 0);
    
    //Casella caselles = new Casella(0, 0);
    
    //constructor
    public Fitxa(String color, Casella casella){
        this.color = color;
        this.fila = new Casella (fila.getFila(),columna.getColumna());
    }
    
    //Guarda el color dins l'atribut
    public void setColor (String color){
        this.color = color;
    }
    //Mètode que retorna el valor de color
    public String getColor () {
        return color;
    }
    
    public Casella getCasella(){
        int fil, col;
        Casella c;
        fil = this.casella.getFila();
        col = this.casella.getColumna();
        c = new Casella(fil, col);
        
        return c;
    }
    
    //public abstract boolean moureA(Casella c); 
    
}
