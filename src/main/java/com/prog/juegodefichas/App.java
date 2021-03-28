/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prog.juegodefichas;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tomeu
 */
public class App {
           
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner (System.in);
        String [][]tablero = new String[5][5];

        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                tablero[i][j]= "0";
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
        
        

        //muestra nomenclatura
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                String fichaEnTablero = "";
                if (colorFitxa.equals("alfil")) {
                    fichaEnTablero = "An";
                } else if(colorFitxa.equals("torre")){
                    fichaEnTablero = "Tn";
                }
                tablero[posicioInicialFitxa.getColumna()][posicioInicialFitxa.getFila()] = fichaEnTablero;

                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        

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
        
        int posFila2 = 0;
        int posColumna2 = 0;
        boolean posicionCorrecta = false;
        do {            
            try{
                //pide posicion de la fila
                System.out.println("¿Qué posición quieres? (Fila de 0 a 5)");
                posFila2 = sc.nextInt();
                //pide posicion de la columna
                System.out.println("¿Qué posición quieres? (Columna de 0 a 5)");
                posColumna2 = sc.nextInt();
                
                if (posFila == posFila2 && posColumna == posColumna2) {
                    System.out.println("Esta posición está ocupada por la ficha: "+colorFitxa);
                } else{
                    posicionCorrecta = true;
                }
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!posicionCorrecta);
        
        Casella posicioInicialFitxa2 = new Casella (posFila2,posColumna2);
        
        Fitxa alfil = new Alfil (colorFitxa2, posicioInicialFitxa2);
        System.out.println(alfil.getColor()+" - posición: "+posicioInicialFitxa2.getFila()+"-"+posicioInicialFitxa2.getColumna());
        
        
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                String fichaEnTablero2 = "";
                if (colorFitxa2.equals("alfil")) {
                    fichaEnTablero2 = "Ab";
                } else if(colorFitxa2.equals("torre")){
                    fichaEnTablero2 = "Tb";
                }
                tablero[posicioInicialFitxa2.getColumna()][posicioInicialFitxa2.getFila()] = fichaEnTablero2;

                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public static String comprovaFitxa(String fichaParaUsar) throws Exception{

           if (fichaParaUsar.equals("alfil") || fichaParaUsar.equals("torre")) {
               return fichaParaUsar;
            } else{
                throw new Exception(" - Ficha incorrecta. Usa alfil o torre."); 
            } 

    }
}