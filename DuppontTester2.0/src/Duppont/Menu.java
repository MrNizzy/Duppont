/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duppont;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Nizzy
 */
public class Menu extends JPanel {
    String Titulo="Duppont",Score="Score:",Vidas="Vidas:";
    public Menu() {
        this.setSize(210, 525);
        this.setLocation(800, 12);
        this.setBackground(Color.decode("#e1d1f2"));
        //this.setBounds(0, 0, WIDTH, HEIGHT);
        //this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.decode("#de2f51"));
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 30));
        g.drawString(Titulo, 60, 35);
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 18));
        g.drawString(Score, 20, 135);
        g.setColor(Color.decode("#000000"));
        g.drawString("0", 80, 135);
        g.setColor(Color.decode("#de2f51"));
        g.drawString(Vidas, 20, 185);
        g.setColor(Color.decode("#000000"));
        g.drawString("0", 80, 185);
    }

}
