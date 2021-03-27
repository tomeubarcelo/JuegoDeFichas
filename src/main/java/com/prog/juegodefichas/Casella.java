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
    int fila;
    int columna;
     
    public static void main(String args[]) {
        Fitxa fitxa1 = new Fitxa("rojo",1,2);
        //no se quin hauria de ser l'altre parametre
        System.out.println(fitxa1.getColor());
        System.out.println(fitxa1.getFila());
        System.out.println(fitxa1.getColumna());
    }
}
