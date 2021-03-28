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
public class App {
           
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner (System.in);
        int [][]tablero = new int[5][5];

        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                tablero[i][j]= i+1;
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("¿Qué color quieres? (blanco o negro)");
        String colorFitxa = sc.next();
        comprovaColorFitxa(colorFitxa);
        
        Casella posicioInicialFitxa = new Casella (1,1);
        
        int vides = 1;
        Fitxa torre = new Torre (colorFitxa, posicioInicialFitxa, vides);
        System.out.println(torre.getColor());
        System.out.println(posicioInicialFitxa.getColumna());
        System.out.println(posicioInicialFitxa.getFila());
    }
    
    public static String comprovaColorFitxa(String color) throws Exception{
        try {
           if (color.equals("blanco") || color.equals("negro")) {
               return color;
            } else{
                return null;
            } 
        } catch (Exception e) {
             throw new Exception(e+" - color incorrecto");        
        }

    }
}