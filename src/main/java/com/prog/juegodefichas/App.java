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
public class App {
    
    public static void main(String args[]) {
        
        int [][]tablero = new int[5][5];
        
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[i].length;j++){
              //dp something with x[i][j]
              tablero[i][j]= i+1;
            }
        }
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        String colorFitxa = "blanc";
        Casella posicioInicialFitxa = new Casella (1,1);
        int vides = 1;
        Fitxa torre = new Torre (colorFitxa, posicioInicialFitxa, vides);
        System.out.println(torre.getColor());
        System.out.println(posicioInicialFitxa.getColumna());
        System.out.println(posicioInicialFitxa.getFila());
    }
    
}
