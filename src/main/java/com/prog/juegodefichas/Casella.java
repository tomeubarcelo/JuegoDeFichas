/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prog.juegodefichas;

import java.util.Scanner;

/**
 *
 * @author tomeu
 */
public class Casella {
    //atributs
    int fila;
    int columna;
     
    public static void main(String args[]) {
        Fitxa fitxa1 = new Fitxa();
        //test
        Scanner sc = new Scanner (System.in);
        System.out.print("¿Qué color quieres?");
        String color = sc.next();
        fitxa1.setColor(color);
        
        System.out.print("Fila");
        int fila = sc.nextInt();
        fitxa1.setFila(fila);
        
        System.out.print("Columna");
        int columna = sc.nextInt();
        fitxa1.setColumna(columna);
        
        System.out.println(fitxa1.getColor());
        System.out.println(fitxa1.getFila());
        System.out.println(fitxa1.getColumna());
    }
}
