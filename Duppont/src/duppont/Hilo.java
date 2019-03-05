/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duppont;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOME
 */
public class Hilo extends Thread{
    Tablero lamina;
    public Hilo(Tablero lamina){
        this.lamina=lamina;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10); //velocidad 1milisegundo
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
        }
    }
}
