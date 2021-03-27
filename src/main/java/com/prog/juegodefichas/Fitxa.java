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
    private int fila;
    private int columna;
    //private final Casella casella = new Casella(0, 0);
    
    Casella caselles;
    
    //constructor
    public Fitxa(){
        
    }
    
    public Fitxa(String color){
        this.color = color;
       // this.fila = new Casella (fila.getFila(),columna.getColumna());
    }
    
    //Guarda el color dins l'atribut
    public void setColor (String color){
        this.color = color;
    }
    //Mètode que retorna el valor de color
    public String getColor () {
        return color;
    }
    
    public void setCasella (int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }
    
    public Casella getCasella(){
        Casella c;
        fila = caselles.getFila();
        columna = caselles.getColumna();
        c = new Casella(fila, columna);
        return c;
    }
    
    public void setFila (int fila){
        this.fila = fila;
    }
    //Mètode que retorna el valor de color
    public int getFila () {
        return fila;
    }
    public void setColumna (int columna){
        this.columna = columna;
    }
    //Mètode que retorna el valor de color
    public int getColumna () {
        return columna;
    }
    //public abstract boolean moureA(Casella c); 
    
}
