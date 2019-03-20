package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class Barra extends JButton implements KeyListener,MouseMotionListener {

    protected int x; //atributo posicion inicial de la paleta en el eje x
    protected int y;  //atributo posicion inicial de la paleta en el eje y
    int ancho = 100;
    int alto = 20;

    public Barra(int x, int y) {
        
        
        //el constructor recibe por parametro la posicion inicial de la paleta
        this.x = x;
        this.y = y;
        this.setBounds(x, y, this.ancho, this.alto); //cordenadas de la paleta y tamaño
        this.addKeyListener(this); //añadir al constructor la escucha del teclado
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent evento) { //evento de la tecla cuando es presionada
        if (evento.getExtendedKeyCode() == KeyEvent.VK_LEFT) {//captura la tecla y pregunta si fue la tecla izquierda
            this.setLocation(this.getX() - 20, this.getY());//si la tecla fue izquierda la posicion en x se deplazara 5 
            //pixeles a la izquierda = -5
        }
        if (evento.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {//captura la tecla y pregunta si fue la tecla derecha
            this.setLocation(this.getX() + 20, this.getY());//si la tecla fue izquierda la posicion en x se deplazara 5 
            //pixeles a la derecha = 5                                            
        }
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
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
            /*this.setLocation(this.getX() - 20, this.getY());//si la tecla fue izquierda la posicion en x se deplazara 5 
            //pixeles a la izquierda = -5
       
        
            this.setLocation(this.getX() + 20, this.getY());//si la tecla fue izquierda la posicion en x se deplazara 5 
            //pixeles a la derecha = 5*/                                            
        
    }

}
