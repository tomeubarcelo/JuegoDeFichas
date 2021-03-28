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
                tablero[i][j]= 0;
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        
        //ficha blanca
        //pide el color
        System.out.println("Empieza la ficha blanca. ¿Qué ficha quieres usar? (alfil o torre)");
        String colorFitxa = sc.next();
        comprovaFitxa(colorFitxa); //metodo que comprueba que solo es alfil o torre
        
        //pide posicion de la fila
        System.out.println("¿Qué posición quieres? (Fila de 0 a 5)");
        int posFila = sc.nextInt();
        //pide posicion de la columna
        System.out.println("¿Qué posición quieres? (Columna de 0 a 5)");
        int posColumna = sc.nextInt();

        
        Casella posicioInicialFitxa = new Casella (posFila,posColumna);
        
        int vides = 1;
        Fitxa torre = new Torre (colorFitxa, posicioInicialFitxa, vides);
        System.out.println("Usarás: "+torre.getColor()+" - posición: "+posicioInicialFitxa.getFila()+"-"+posicioInicialFitxa.getColumna());
        //System.out.println(posicioInicialFitxa.getFila());
        //System.out.println(posicioInicialFitxa.getColumna());
        
        //ficha negra
        //si anteriormente ya se ha elegido alfil, ahora se usara la torre, o viceversa
        
        String colorFitxa2 = "";
        if (colorFitxa.equals("alfil")) {
            colorFitxa2 = "torre";
        } else{
            colorFitxa2 = "alfil";
        }
        comprovaFitxa(colorFitxa2); //metodo que comprueba que solo es alfil o torre
        System.out.println("Tu usarás "+colorFitxa2);
        //pide posicion de la fila
        System.out.println("¿Qué posición quieres? (Fila de 0 a 5)");
        int posFila2 = sc.nextInt();
        //pide posicion de la columna
        System.out.println("¿Qué posición quieres? (Columna de 0 a 5)");
        int posColumna2 = sc.nextInt();
        
        
        Casella posicioInicialFitxa2 = new Casella (posFila2,posColumna2);
        
        Fitxa alfil = new Alfil (colorFitxa2, posicioInicialFitxa2);
        System.out.println(alfil.getColor()+" - posición: "+posicioInicialFitxa2.getFila()+"-"+posicioInicialFitxa2.getColumna());
        //System.out.println(posicioInicialFitxa2.getFila());
        //System.out.println(posicioInicialFitxa2.getColumna());
        /*for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {

                int posicion = tablero[posicioInicialFitxa.getColumna()][posicioInicialFitxa.getFila()];
                String posicionFicha=String.valueOf(posicion);
                posicionFicha = 
                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }*/
    }
    
    public static String comprovaFitxa(String fichaParaUsar) throws Exception{

           if (fichaParaUsar.equals("alfil") || fichaParaUsar.equals("torre")) {
               return fichaParaUsar;
            } else{
                throw new Exception(" - Ficha incorrecta. Usa alfil o torre."); 
            } 

    }
}