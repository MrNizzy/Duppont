package Game;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JButton;
import javax.swing.JLabel;

public class Barra extends JButton implements KeyListener, MouseMotionListener {

    protected int x; //atributo posicion inicial de la paleta en el eje x
    protected int y;  //atributo posicion inicial de la paleta en el eje y
    private int Xmoved;
    int ancho = 100;
    int alto = 20;
    ImageIcon fondo = new ImageIcon(getClass().getResource("Barra.gif"));

    public Barra(int x, int y) {

        //el constructor recibe por parametro la posicion inicial de la paleta
        
        //setBackground(Color.black);
        setIcon(fondo);
        this.x = x;
        this.y = y;
        this.setBounds(x, y, this.ancho, this.alto); //cordenadas de la paleta y tamaño
        this.addMouseMotionListener(this);
        this.addKeyListener(this); //añadir al constructor la escucha del teclado
        

    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent evento) { //evento de la tecla cuando es presionada
        if (evento.getExtendedKeyCode() == KeyEvent.VK_LEFT) {//captura la tecla y pregunta si fue la tecla izquierda
            if (getX() <= 0) {
                this.setLocation(0, this.getY());
                this.setX(0);
            } else {
                this.setLocation(this.getX() - 20, this.getY());//si la tecla fue izquierda la posicion en x se deplazara 5 
                //pixeles a la izquierda = -5
            }
            System.out.println("Izquierda: X=" + this.getX() + "\n");
        }
        if (evento.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {//captura la tecla y pregunta si fue la tecla derecha
            if (getX() >= 680) {
                this.setLocation(680, this.getY());
                this.setX(680);
            } else {
                this.setLocation(this.getX() + 20, this.getY());//si la tecla fue derecha la posicion en x se deplazara 5 
                //pixeles a la derecha = 5
            }
            System.out.println("Derecha: X=" + this.getX() + "\n");
        }

    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public int getAncho() {
        return this.ancho;
    }

    public int getAlto() {
        return this.alto;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        /*
        Xmoved = e.getX();
        //setX(Xmoved);

        if (Xmoved >= 0 && Xmoved < 300) {

            this.setLocation(getX() - Xmoved, this.getY());

        } else if (Xmoved > 300 && Xmoved <= 680) {

            this.setLocation(getX() + Xmoved, this.getY());

        } else if (Xmoved == 300) {

            this.setLocation(300, this.getY());

        } else if (Xmoved < 0) {

            this.setLocation(0, this.getY());
            this.setX(0);

        } else if (Xmoved > 680) {

            this.setLocation(680, this.getY());
            this.setX(680);

        }
        System.out.println(Xmoved);*/

    }

}
