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
        boolean dadaOk;
        String colorFitxa = "";
        do {                          
            try {
                colorFitxa = sc.next();
                    if (comprovaFitxa(colorFitxa)) {  //metodo que comprueba que solo es alfil o torre 
                        dadaOk = true;
                    } else{
                        System.out.println("introduce alfil o torre");
                        dadaOk = false;
                    }
            } catch (Exception e) {
                System.err.println(e);
                dadaOk = false;
            }
        } while (!dadaOk);

        
        //pide posicion de la fila
        System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
        int posFila = 0;
        dadaOk = false;
        do {            
            try {
                posFila = sc.nextInt();
                if (posFila >= 0 && posFila <= 4) {
                    dadaOk = true;
                } else{
                    System.out.println("Vuelve a seleccionar una fila de 0 a 4");
                    dadaOk = false;
                }
            } catch (Exception e) {
                dadaOk = false;
                System.err.println(e);
            }
        } while (!dadaOk);
        
        //pide posicion de la columna
        dadaOk = false;
        System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
        int posColumna = 0;
        do {            
            try {
                posColumna = sc.nextInt();
                if (posColumna >= 0 && posColumna <= 4) {
                    dadaOk = true;
                } else{
                    System.out.println("Vuelve a seleccionar una columna de 0 a 4");
                    dadaOk = false;
                }
            } catch (Exception e) {
                dadaOk = false;
                System.err.println(e);
            }
        } while (!dadaOk);
        

        //declaramos clase casilla
        Casella posicioInicialFitxa = new Casella (posFila,posColumna);
        
        int vides = 1;
        Fitxa torre = new Torre (colorFitxa, posicioInicialFitxa, vides);
        System.out.println("Usarás: "+torre.getColor()+" - posición: "+posicioInicialFitxa.getFila()+"-"+posicioInicialFitxa.getColumna());
        //System.out.println(posicioInicialFitxa.getFila());
        //System.out.println(posicioInicialFitxa.getColumna());
        
        
        String fichaEnTablero = "";
        //muestra nomenclatura
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                //String fichaEnTablero = "";
                if (colorFitxa.equals("alfil")) {
                    fichaEnTablero = "Ab";
                } else if(colorFitxa.equals("torre")){
                    fichaEnTablero = "Tb";
                }
                tablero[posicioInicialFitxa.getFila()][posicioInicialFitxa.getColumna()] = fichaEnTablero;

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
        //comprovaFitxa(colorFitxa2); //metodo que comprueba que solo es alfil o torre
        System.out.println("\nTu usarás "+colorFitxa2);
        
        int posFila2 = 0;
        int posColumna2 = 0;
        boolean posicionCorrecta = false;
        do {            
            try{
                //pide posicion de la fila
                System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
                posFila2 = sc.nextInt();

                dadaOk = false;
                do {            
                    try {
                        if (posFila2 >= 0 && posFila2 <= 4) {
                            dadaOk = true;
                        } else{
                            System.out.println("Vuelve a seleccionar una fila de 0 a 4");
                            dadaOk = false;
                        }
                    } catch (Exception e) {
                        dadaOk = false;
                        System.err.println(e);
                    }
                } while (!dadaOk);
        
                //pide posicion de la columna
                System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
                posColumna2 = sc.nextInt();
                dadaOk = false;
                do {            
                    try {
                        if (posColumna2 >= 0 && posColumna2 <= 4) {
                            dadaOk = true;
                        } else{
                            System.out.println("Vuelve a seleccionar una columna de 0 a 4");
                            dadaOk = false;
                        }
                    } catch (Exception e) {
                        dadaOk = false;
                        System.err.println(e);
                    }
                } while (!dadaOk);
                
                
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
        
        String fichaEnTablero2 = "";
        for (int i=0; i < tablero.length; i++) {
            for (int j=0; j < tablero[i].length; j++) {
                //fichaEnTablero2 = "";
                if (colorFitxa2.equals("alfil")) {
                    fichaEnTablero2 = "An";
                } else if(colorFitxa2.equals("torre")){
                    fichaEnTablero2 = "Tn";
                }
                tablero[posicioInicialFitxa2.getFila()][posicioInicialFitxa2.getColumna()] = fichaEnTablero2;

                System.out.print(tablero[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n");
        
        //que ficha es la 1a y la 2a
        System.out.println("Primera ficha: "+fichaEnTablero);
        System.out.println("Segunda ficha: "+fichaEnTablero2);
        System.out.println(turnoParaFicha(fichaEnTablero));
        String fichaQueMuevePrimero = turnoParaFicha(fichaEnTablero);
        
        boolean winTn = false;
        boolean winAn = false;
        
        boolean kill = false;
        do {            

        
        //mas movimientos
        System.out.println("Turno para: "+fichaEnTablero);
        
        
        //comprueba si primero va alfil blanca o torre blanca
        if (fichaQueMuevePrimero.equals("Ab")) {
            //pide posicion de la fila
            System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
            int posFila3 = sc.nextInt();
            //pide posicion de la columna
            System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
            int posColumna3 = sc.nextInt();
            Casella posicioInicialFitxa3 = new Casella (posFila3,posColumna3);
            
            //caso en el que le toca al alfil siendo blanco
            if (alfil.moureA(posicioInicialFitxa,posicioInicialFitxa3)) {
                alfil.getPosicio();
                for (int i=0; i < tablero.length; i++) {
                    for (int j=0; j < tablero[i].length; j++) {
                        //String fichaEnTablero3 = "Ab";

                        tablero[posicioInicialFitxa3.getFila()][posicioInicialFitxa3.getColumna()] = fichaEnTablero;
                        tablero[posicioInicialFitxa.getFila()][posicioInicialFitxa.getColumna()] = "0";
                        System.out.print(tablero[i][j]+"\t");
                    }
                    System.out.println("");
                }
            } else{
                System.out.println("Error. No puedes hacer ese movimiento");
            }
            posicioInicialFitxa = posicioInicialFitxa3; //asignamos esta posicion a la posicion actual
            
        } else if(fichaQueMuevePrimero.equals("Tb")){
            //pide posicion de la fila
            System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
            int posFila4 = sc.nextInt();
            //pide posicion de la columna
            System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
            int posColumna4 = sc.nextInt();
            Casella posicioInicialFitxa4 = new Casella (posFila4,posColumna4);

            //caso en el que le toca a la torre siendo blanca
            if (torre.moureA(posicioInicialFitxa2,posicioInicialFitxa4)) {
                torre.getPosicio();
                for (int i=0; i < tablero.length; i++) {
                    for (int j=0; j < tablero[i].length; j++) {

                        tablero[posicioInicialFitxa4.getFila()][posicioInicialFitxa4.getColumna()] = fichaEnTablero2;
                        tablero[posicioInicialFitxa2.getFila()][posicioInicialFitxa2.getColumna()] = "0";
                        System.out.print(tablero[i][j]+"\t");
                    }
                    System.out.println("");
                }
            } else{
                System.out.println("Error. No puedes hacer ese movimiento");
            }
            posicioInicialFitxa2 = posicioInicialFitxa4; //asignamos esta posicion a la posicion actual
        }
        

        //mas movimientos
        String fichaQueMueveDespues = turnoParaFicha(fichaEnTablero2);
        System.out.println(fichaQueMueveDespues);
        System.out.println("Turno para: "+fichaEnTablero2);
        
        //comprueba si primero va alfil negra o torre negra
        if (fichaQueMueveDespues.equals("An")) {
            //pide posicion de la fila
            System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
            int posFila3 = sc.nextInt();
            //pide posicion de la columna
            System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
            int posColumna3 = sc.nextInt();
            Casella posicioInicialFitxa3 = new Casella (posFila3,posColumna3);
            
            
            //caso en el que le toca al alfil siendo negro
            if (alfil.moureA(posicioInicialFitxa,posicioInicialFitxa3)) {
                alfil.getPosicio();
                for (int i=0; i < tablero.length; i++) {
                    for (int j=0; j < tablero[i].length; j++) {
                        //String fichaEnTablero3 = "Ab";
                        if (tablero[posicioInicialFitxa3.getFila()][posicioInicialFitxa3.getColumna()].equals(fichaEnTablero2)) {
                            System.out.println("Has matado! Enhorabuena "+fichaEnTablero);
                            kill = true;
                            winAn = true;
                            
                        }
                        tablero[posicioInicialFitxa3.getFila()][posicioInicialFitxa3.getColumna()] = fichaEnTablero;
                        tablero[posicioInicialFitxa.getFila()][posicioInicialFitxa.getColumna()] = "0";

                        System.out.print(tablero[i][j]+"\t");
                    }
                    System.out.println("");
                }
            } else{
                System.out.println("Error. No puedes hacer ese movimiento");
            }
            posicioInicialFitxa = posicioInicialFitxa3; //asignamos esta posicion a la posicion actual
            
        } else if(fichaQueMueveDespues.equals("Tn")){
            //pide posicion de la fila
            System.out.println("¿Qué posición quieres? (Fila de 0 a 4)");
            int posFila4 = sc.nextInt();
            //pide posicion de la columna
            System.out.println("¿Qué posición quieres? (Columna de 0 a 4)");
            int posColumna4 = sc.nextInt();
            Casella posicioInicialFitxa4 = new Casella (posFila4,posColumna4);
            
            
            //caso en el le toca a la torre siendo negra
            if (torre.moureA(posicioInicialFitxa2,posicioInicialFitxa4)) {
                torre.getPosicio();
                for (int i=0; i < tablero.length; i++) {
                    for (int j=0; j < tablero[i].length; j++) {
                        if (tablero[posicioInicialFitxa4.getFila()][posicioInicialFitxa4.getColumna()].equals(fichaEnTablero)) {
                            System.out.println("Has matado! Enhorabuena "+fichaEnTablero2);
                            kill = true;
                            winTn = true;
                        }
                        tablero[posicioInicialFitxa4.getFila()][posicioInicialFitxa4.getColumna()] = fichaEnTablero2;
                        tablero[posicioInicialFitxa2.getFila()][posicioInicialFitxa2.getColumna()] = "0";
                        System.out.print(tablero[i][j]+"\t");
                    }
                    System.out.println("");
                }
            } else{
                System.out.println("Error. No puedes hacer ese movimiento");
            }
            posicioInicialFitxa2 = posicioInicialFitxa4; //asignamos esta posicion a la posicion actual
        }
            
        } while (!kill || !winTn || !winAn);
    }
    
    public static boolean comprovaFitxa(String fichaParaUsar) throws Exception{
        
        try {
            return fichaParaUsar.equals("alfil") || fichaParaUsar.equals("torre"); 
        } catch (Exception e) {
            throw new Exception(e+" - Ficha incorrecta. Usa alfil o torre."); 
        }
         
    }
    
    public static String turnoParaFicha(String fichaQueMovera){
        String turnoPara= "";
        if (fichaQueMovera.equals("Ab")) {
            //System.out.println("1er condicional. Ab");
            turnoPara = "Ab";
        } else if(fichaQueMovera.equals("Tb")){
            //System.out.println("2o condicional. Tb");
            turnoPara = "Tb";
        } else if(fichaQueMovera.equals("An")){
            //System.out.println("3er condicional. An");
            turnoPara = "An";
        } else if(fichaQueMovera.equals("Tn")) {
            //System.out.println("4o condicional. Tn");
            turnoPara = "Tn";
        }
        return turnoPara;
    }
    
    public static void continuarJugando(){
        
    }
}