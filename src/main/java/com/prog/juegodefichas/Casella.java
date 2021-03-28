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
public class Casella {
    //atributs
    private int fila;
    private int columna;
     
    public Casella(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }
    
    //Guarda fila dins l'atribut
    public void setFila (int fila){
        this.fila = fila;
    }
    //Mètode que retorna el valor de fila
    public int getFila () {
        return fila;
    }
    
    //Guarda la columna dins l'atribut
    public void setColumna (int columna){
        this.columna = columna;
    }
    //Mètode que retorna el valor de columna
    public int getColumna () {
        return columna;
    }
    
}
