/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duppont;

import static duppont.Atributos.BARRA_HEIGHT;
import static duppont.Atributos.BARRA_WIDTH;
import static duppont.Atributos.WINDOW_HEIGHT;
import static duppont.Atributos.WINDOW_WIDTH;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Nizzy
 */
public class Barra extends JFrame implements MouseMotionListener, Atributos{
    int x = 515, y = 20;
    
    @Override
    public void paint(Graphics g) {
        //Fondo
        g.setColor(Color.decode("#3b5998"));
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.setColor(Color.yellow);
        g.fillRect(WINDOW_WIDTH + x, WINDOW_HEIGHT - 40, BARRA_WIDTH, BARRA_HEIGHT);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX() - 835;
        y = WINDOW_HEIGHT - 40;
        repaint();
    }
}