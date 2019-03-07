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
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Nizzy
 */
public class Opciones extends javax.swing.JPanel implements Atributos {

    public Opciones() {
        this.setBackground(Color.yellow);
        this.setBounds(0, 0, 150, WINDOW_HEIGHT);
        this.setLocation(WINDOW_WIDTH, 0);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //Fondo
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.setColor(Color.WHITE);

        g.setFont(new Font("Impact", Font.PLAIN, 30));
        g.drawString("Duppont", 15, 40);
        g.drawString("v1.1.5", 30, 140);
    }

}
