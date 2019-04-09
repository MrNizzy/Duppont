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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Brallan Orlando Hernandez Pardo
 * @e-mail 3134183631y@gmail.com
 */
public class Menu extends JPanel {

    private final Image title;
    private final Image Vidas_title;
    private final Image Tiempo_title;
    private final Image Score_title;
    private final Image TOPL;
    JLabel Scores;
    String Titulo = "Duppont", Score = "Score:", Vidas = "Vidas:", Time = "Time: ";
    String SegundosSet = "0";
    int TimeOut = 30,puntac=0;
    ImageIcon fondo;
    Timer tiempo;
    String puntuacion;

    //Recursos
    ResourcesBrick resources;

    public Menu() {
        //Inicializacion
        resources = new ResourcesBrick();
        resources.setRuta("/Images/");

        Tiempo_title = new ImageIcon(getClass().getResource(resources.getRuta() + "Time.png")).getImage();
        TOPL = new ImageIcon(getClass().getResource(resources.getRuta() + "TopPl.png")).getImage();
        Vidas_title = new ImageIcon(getClass().getResource(resources.getRuta() + "Vidas.png")).getImage();
        Score_title = new ImageIcon(getClass().getResource(resources.getRuta() + "Score.png")).getImage();
        /**
         * ************************************************************************************************
         */
        this.fondo = new ImageIcon(getClass().getResource(resources.getRuta() + "image.png"));//Fondo
        this.setSize(210, 460);//Tamaño
        this.setLocation(800, 7);//Localizacion
        this.setBackground(Color.decode("#ffff66"));//Fondo
        title = new ImageIcon(getClass().getResource(resources.getRuta() + "Title.png")).getImage();//Titulo
        Scores = new JLabel("Score");
        Scores.setLocation(820, 135);
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TimeOut >= 0) {
                    DisminuirTiempo();
                    repaint();
                } else {
                    tiempo.stop();
                }

            }
        });
        tiempo.start();
        resources.LeerPuntajes();

    }

    public void DisminuirTiempo() {
        TimeOut = TimeOut - 1;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //delaySegundo();
        g.setColor(Color.decode("#ffff33"));
        g.drawString(SegundosSet, 80, 135);
        g.setColor(Color.decode("#de2f51"));
        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 30));
        g.drawImage(title, 30, 20, this);

        g.setFont(new Font("DFGothic-EB", Font.PLAIN, 18));
        g.drawImage(Tiempo_title, 5, 110, this);
        g.setColor(Color.decode("#ffff66"));
        g.fillRect(90, 135, 120, 145);

        SegundosSet = Integer.toString(TimeOut);
        g.setColor(Color.decode("#000000"));
        if (TimeOut >= 0) {
            g.drawString(SegundosSet + " seg", 90, 135);
        } else {
            SegundosSet = "Time Out";
            g.drawString(SegundosSet, 90, 135);
        }

        g.drawImage(Vidas_title, 5, 160, this);
        g.setColor(Color.decode("#de2f51"));
        //g.drawString(Vidas, 5, 170);
        g.setColor(Color.decode("#000000"));
        g.drawImage(Score_title, 5, 200, this);
        g.drawString("3", 80, 185);
        g.setColor(Color.decode("#de2f51"));
        //g.drawString(Score, 20, 210);
        g.setColor(Color.decode("#000000"));
        puntuacion = Integer.toString(resources.getPuntaje());
        g.drawString(puntuacion, 135, 225);
        
        //Ultimos Jugadores
        g.drawImage(TOPL, 20, 235, null);
        g.drawString(resources.ScoreLinea(0), 20, 300);
        g.drawString(resources.ScoreLinea(1), 20, 320);
        g.drawString(resources.ScoreLinea(2), 20, 340);

    }

    public int getTimeOut() {
        return TimeOut;
    }
    
    public void puntajeadd(){
        resources.puntaje++;
    }
    
    public void getpuntaje(int puntaje){
        resources.puntaje=resources.puntaje+puntaje;
        puntac=puntac+resources.puntaje;
    }

}
