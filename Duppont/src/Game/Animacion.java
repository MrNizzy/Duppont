package Game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Brallan Orlando Hernandez Pardo
 * @e-mail 3134183631y@gmail.com
 */

public class Animacion extends JPanel{
     
    // Instancia a la Balón en posicion (X,Y) = (0,0)
    private Pelota mipelota;
    private Timer timer;
    private double rotate;
    
    // Constructor
    public Animacion(Dimension d, int tamanio) {
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.setBackground(new Color(225,209,242));
        
        mipelota = new Pelota(390, 450, tamanio);
        mipelota.LimitesXY(getWidth(), getHeight());
        
        // Para la animación
        timer = new Timer(16, new ActionListener (){
            public void actionPerformed(ActionEvent e) {                
                //mipelota.traslacion(WINDOW_WIDTH+x,WINDOW_HEIGHT-25,70);  
                
                repaint();    
            }
        });
    }

    //Controla el inicio y fin de la animación
    public void animar(boolean turnOnOff) {
        if (turnOnOff) {
            mipelota.velocidadXY();
            timer.start(); 
        } else {
            timer.stop();
            this.removeAll();
            this.repaint();
        }
    }

    public void girar(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        AffineTransform oldt = g2.getTransform();     
        rotate=(int)(Math.random()*360);   
        g2.transform(AffineTransform.getRotateInstance(Math.toRadians(rotate),Math.random(),Math.random()));
        g2.setStroke(new BasicStroke(4.0f));
        g2.setTransform(oldt);
        this.repaint();
    }
    //pinta la animación
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mipelota.dibujar(g);
    }
    
}
