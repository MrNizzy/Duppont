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
private boolean mover=true;
    private Image balon;
    //Coordenadas del Balon
    private int X;
    private int Y;
    //Velocidades
    private int Dx;
    private int Dy;
    //Limites
    private final int limite_izquierda = 0;
    private int limite_derecha;
    private final int limite_superior = 0;
    private int limite_inferior;
    //Tamaño y Fondo
    private int tamanio;
    private Image fondo;
    //Audio e Imagenes
    private final ResourcesBrick resources;

    public Pelota(int x, int y, int tamanio) {
        //coordenadas iniciales
        this.X = x;
        this.Y = y;

        //Inicialización de los recursos
        resources = new ResourcesBrick();
        resources.setRuta("/Images/");

        //imagen de Balon
        if (tamanio == 0) {
            balon = new ImageIcon(getClass().getResource(resources.getRuta() + "Bola.png")).getImage();
            fondo = new ImageIcon(getClass().getResource(resources.getRuta() + "image.png")).getImage();
        }
        if (tamanio == 1) {
            balon = new ImageIcon(getClass().getResource(resources.getRuta() + "pelota48.png")).getImage();
        }
    }

    //dado las dimensiones del contendor JPanel
    public void LimitesXY(int width, int height) {
        limite_derecha = width - balon.getWidth(null);
        limite_inferior = height - balon.getHeight(null);
    }
void Mover(boolean mover){
    this.mover=mover;
}
    //recalcula variables para dar la sensacion de movimiento
    public void traslacion(int x, int y) {
   
   if(mover==true){ 
    
        X += Dx;
        Y += Dy;   
   }
        //controla que la Balon no salga de los limites del contenedor
        if (X < this.limite_izquierda) {
            X = 0;
            Dx = -Dx;
            resources.Audio("/Audios/", "brick", ".wav");
        } else if (X > limite_derecha) {
            X = limite_derecha;
            Dx = -Dx;
            resources.Audio("/Audios/", "brick", ".wav");
        }
        if (Y < this.limite_superior) {
            Y = 0;
            Dy = -Dy;
            resources.Audio("/Audios/", "brick", ".wav");

        } else if ((Y > limite_inferior)) {
            Y = limite_inferior;
            Dy = -Dy;
            resources.AudioColi("/Audios/", ".wav");
        }
        /*else if ((Y == limite_inferior-20&&(X>=barra.getX()&&X<=barra.getX()+100))) {
            Y = limite_inferior;
            velocidad_Y = -velocidad_Y;
            resources.Audio("/Audios/", "barra", ".wav");
        }*/
    }

    public void reflejarY() {
        Dy *= -1;
        Y = Y - 5;
        resources.AudioColi("/Audios/", ".wav");
    }

    public void reflejarX() {
        Dx *= -1;
        X = X - 5;
    }

    public void reflejarYN(int coord) {
        Dy *= -1;
        Y = coord - 15;
    }

    public void reflejarXI(int coord) {
        Dx *= -1;
        X = coord - 15;
    }

    public void reflejarXD(int coord) {
        Dx *= -1;
        X = coord + 100;
    }

    public void reflejarYS(int coord) {
        Dy *= -1;
        Y = coord + 50;
    }

    int GetXP() {
        return X;
    }

    int GetYP() {
        return Y;
    }

    int GetDX() {
        return Dx;
    }

    int GetDY() {
        return Dy;
    }
   

    public void velocidadXY() {
        Dx = 2;
        Dy = 3;
    }
    public void dibujar(Graphics g) {
        Graphics2D background = (Graphics2D) g;
        Graphics2D g2 = (Graphics2D) g;
        background.drawImage(fondo, 0, 0, limite_derecha + balon.getWidth(null), limite_inferior + balon.getHeight(null), null);
        g2.drawImage(balon, X, Y, null);
        //g.fillOval(X, Y, 15, 15);
    }

    //devuelve un número aleatorio entre 1 y MAX
    private int aleatorio(int Max) {
        return (int) (Math.random() * Max + 1);
    }

}
