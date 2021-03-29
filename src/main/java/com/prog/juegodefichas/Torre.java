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
public class Torre extends Fitxa{
    
    private int vides;
    
    public Torre(String color, Casella posicio, int vida){
        super(color, posicio);
        this.vides = vida;
    }
    
    public int getVides() {
        return vides;
    }

    public void setVides(int vides) {
        this.vides = vides;
    }

    public boolean moureA(Casella c, Casella desti) {
        if (c.getFila() == desti.getFila() || c.getColumna() == desti.getColumna()) {          
            return true;
        } else{
            return false;
        }
    }
    
}
