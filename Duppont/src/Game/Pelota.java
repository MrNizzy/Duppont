package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Brallan Orlando Hernandez Pardo
 * @e-mail 3134183631y@gmail.com
 */

public class Pelota {
    
    private Image balon;
    //Coordenadas del Balon
    private int X;       
    private int Y;

    private int velocidad_X;
    private int velocidad_Y;

    private int limite_izquierda=0;
    private int limite_derecha;
    private int limite_superior=0;
    private int limite_inferior;
    
    private int tamanio;
    private Image fondo;

     public Pelota(int x, int y, int tamanio) {
        //coordenadas iniciales
        this.X = x; this.Y = y;
        //imagen de Balon
        if (tamanio == 0) {
            balon = new ImageIcon(getClass().getResource("Bola.png")).getImage();
            fondo = new ImageIcon(getClass().getResource("image.png")).getImage();
        }
        if (tamanio == 1) {
            balon = new ImageIcon(getClass().getResource("pelota48.png")).getImage();
        }
    }

    //dado las dimensiones del contendor JPanel
   public void LimitesXY(int width, int height) {
        limite_derecha  = width  - balon.getWidth(null);
        limite_inferior = height - balon.getHeight(null);
    }

   //recalcula variables para dar la sensacion de movimiento
   public void traslacion(int x,int y) {
        //nueva posicion
        X += velocidad_X;
        Y += velocidad_Y;
        //controla que la Balon no salga de los limites del contenedor
        if (X < this.limite_izquierda) {
            X = 0;     
            velocidad_X = -velocidad_X; 
        } else if (X > limite_derecha) {
            X = limite_derecha; 
            velocidad_X = -velocidad_X; 
        }
        if (Y < this.limite_superior) {
            Y = 0;
            velocidad_Y = -velocidad_Y;

        } else if ((Y > limite_inferior)) {
            Y =  limite_inferior;
            velocidad_Y = -velocidad_Y;
        }
    }

    public void velocidadXY(){
        velocidad_X = 6;
        velocidad_Y = 6;
    }
    
    public void dibujar(Graphics g) {
        Graphics2D background=(Graphics2D)g;
        Graphics2D g2 = (Graphics2D)g;
        background.drawImage(fondo, 0,0,limite_derecha+balon.getWidth(null),limite_inferior+balon.getHeight(null), null);
        g2.drawImage(balon, X, Y, null);
        //g.fillOval(X, Y, 15, 15);
    }

    //devuelve un número aleatorio entre 1 y MAX
    private int aleatorio(int Max){
        return (int) (Math.random()*Max+1);
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    
    
}
