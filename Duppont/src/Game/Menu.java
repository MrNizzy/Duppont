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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Brallan Orlando Hernandez Pardo
 * @e-mail 3134183631y@gmail.com
 */
public class Menu extends JPanel {

    private Image title;
    JLabel Scores;
    String Titulo = "Duppont", Score = "Score:", Vidas = "Vidas:",Time="Time: ";
    String SegundosSet = "0";
    int TimeOut = 850;

    public Menu() {
        this.setSize(210, 460);
        this.setLocation(800, 7);
        this.setBackground(Color.decode("#e1d1f2"));
        title = new ImageIcon(getClass().getResource("Title.gif")).getImage();
        Scores = new JLabel("Score");
        Scores.setLocation(820, 135);

        //cronometro();
        //add(Scores);
        //this.setBounds(0, 0, WIDTH, HEIGHT);
        //this.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //delaySegundo();
        g.setColor(Color.decode("#de2f51"));
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 30));
        g.drawImage(title, 30, 20, this);
        //g.drawString(Titulo, 60, 35);
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 18));
        g.drawString(Time, 20, 135);
        g.setColor(Color.decode("#e1d1f2"));
        g.fillOval(80, 135, 90, 150);
        g.setColor(Color.decode("#000000"));

        if (TimeOut >= 0) {
            TimeOut = TimeOut - ((int) (Math.random() * 5 + 1));
            SegundosSet = Double.toString(TimeOut);
            if (TimeOut <= 0) {
                SegundosSet = "Time out";
            }
        } else {
            SegundosSet = "Time out";
        }

        g.drawString(SegundosSet, 80, 135);
        g.setColor(Color.decode("#de2f51"));
        g.drawString(Vidas, 20, 185);
        g.setColor(Color.decode("#000000"));
        g.drawString("3", 80, 185);
        g.setColor(Color.decode("#de2f51"));
        g.drawString(Score, 20, 210);
        g.setColor(Color.decode("#000000"));
        g.drawString("None", 80, 210);

    }

    public int getTimeOut() {
        return TimeOut;
    }

    private static void delaySegundo() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

    }

    private void cronometro() {

        //Contador de tiempo
        int Minutos = 0, Segundos = 0;

        for (Minutos = 0; Minutos < 3; Minutos++) {

            for (Segundos = 0; Segundos < 60; Segundos++) {
                SegundosSet = Double.toString(Segundos);
                System.out.println(Segundos);
                delaySegundo();
                repaint();
            }

        }
    }

}
