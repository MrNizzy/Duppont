package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Nizzy
 */
public class Barra extends JPanel implements MouseMotionListener {

    private int x, y, WINDOW_HEIGHT, WINDOW_WIDTH, limite;
    private int Score;
    private Timer timer;
    private Pelota mipelota;
    private Image barra;
    private Image fondo;
    private lv1 nivel1;

    public Barra(Dimension d, int tamanio) {
        //Propiedades de la ventana
        this.setSize(d);
        this.setPreferredSize(d);
        WINDOW_HEIGHT = d.height;
        WINDOW_WIDTH = d.width;
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.setBackground(new Color(225, 209, 242));
        addMouseMotionListener(this);
        
        barra=new ImageIcon(getClass().getResource("barra.gif")).getImage();
        fondo=new ImageIcon(getClass().getResource("background.gif")).getImage();

        //dimension de la ventana entre 2
        x = d.width / 2;

        //Objeto Pelota
        nivel1=new lv1();
        mipelota = new Pelota(390, 450, tamanio);
        mipelota.LimitesXY(getWidth(), getHeight());

        // Para la animación de la pelota
        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mipelota.traslacion(WINDOW_WIDTH+x,WINDOW_HEIGHT-25,70);

                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //Fondo
        super.paint(g);
        
        g.setColor(Color.decode("#ff6600"));
        Graphics2D g2 = (Graphics2D)g;
        Graphics2D g3 = (Graphics2D)g;
        
        //g3.drawImage(fondo, 0,0,getWidth(),getHeight(), null);
        //Dibujo de la barra ejecutada al mover el mouse
        if (limite > -780 && limite < -125) {
            //g.fillRect(WINDOW_WIDTH + x, WINDOW_HEIGHT - 25, 70, 15);
            g2.drawImage(barra, WINDOW_WIDTH + x, WINDOW_HEIGHT - 25, null);
        }
        if (limite < -780) {
            g2.drawImage(barra, WINDOW_WIDTH + -780, WINDOW_HEIGHT - 25, null);
            //g.fillRect(WINDOW_WIDTH + -780, WINDOW_HEIGHT - 25, 70, 15);
        }
        if (limite > -125) {
            g2.drawImage(barra, WINDOW_WIDTH + -125, WINDOW_HEIGHT - 25, null);
            //g.fillRect(WINDOW_WIDTH + -70, WINDOW_HEIGHT - 25, 70, 15);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        //Para que la barra quede centrada en el puntero del mouse
        x = e.getX() - 835;
        
        //Para que no dibuje mas allá de sus limites
        limite = x;
        
        //System.out.println(limite);
        y = WINDOW_HEIGHT - 40;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mipelota.dibujar(g);
        nivel1.dibujar(g);
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

}
