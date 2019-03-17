/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Brallan Orlando Hernandez Pardo
 * @e-mail 3134183631y@gmail.com
 */
public class Menu extends JPanel {
    private Image title;
    String Titulo="Duppont",Score="Score:",Vidas="Vidas:";
    public Menu() {
        this.setSize(210, 460);
        this.setLocation(800, 7);
        this.setBackground(Color.decode("#e1d1f2"));
        title = new ImageIcon(getClass().getResource("Title.png")).getImage();
        //this.setBounds(0, 0, WIDTH, HEIGHT);
        //this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.decode("#de2f51"));
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 30));
        g.drawImage(title, 30, 20, this);
        //g.drawString(Titulo, 60, 35);
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
