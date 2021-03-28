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
public abstract class Fitxa {
    //atributs
    protected String color;
    protected Casella posicio;
   
    //constructor per defecte
    public Fitxa(){
        
    }
    //constructor amb parametres
    public Fitxa(String color, Casella posicio){
        this.color = color;
        this.posicio = new Casella (posicio.getFila(), posicio.getColumna());
    }
    
    //Guarda el color dins l'atribut
    public void setColor (String color){
        this.color = color;
    }
    //Mètode que retorna el valor de color
    public String getColor () {
        return color;
    }
    
    public void setPosicio(Casella posicio){
         this.posicio = new Casella (posicio.getFila(), posicio.getColumna());
    }
    
    public Casella getPosicio(){
        Casella c;
        c =  new Casella (posicio.getFila(), posicio.getColumna());  
        return c;
    }
    
    //metodo abstract
    public abstract boolean moureA(Casella c); 
    
}
