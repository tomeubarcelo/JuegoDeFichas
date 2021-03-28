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
    
    
    @Override
    public boolean moureA(Casella c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Casella getBloc() {
        return bloc;
    }

    public void setBloc(Casella bloc) {
        this.bloc = bloc;
    }
    
}
