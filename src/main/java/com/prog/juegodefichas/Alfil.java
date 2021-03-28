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
public class Alfil extends Fitxa{
    private Casella bloc;
    
    public Alfil(String color, Casella posicio){
        super(color, posicio);
        this.bloc = bloc;
    }

    public Casella getBloc() {
        return bloc;
    }

    public void setBloc(Casella bloc) {
        this.bloc = bloc;
    }

    public boolean moureA(Casella c) {
        if (c.getFila() == c.getFila()+1) {
            return true;
        } else{
            return false;
        }
        
    }
    
}
