/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duppont;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Nizzy
 */
public class ColorFondo extends JPanel{
    public ColorFondo() {
        this.setSize(1200, 600);
        this.setBackground(Color.decode("#02024b"));
        this.setLocation(0, 0);
        //this.setBounds(0, 0, WIDTH, HEIGHT);
        //this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
    }
}
