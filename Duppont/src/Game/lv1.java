package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Nizzy
 */
public class lv1 {
    
    private Image Block_1;
    private Image Block_2;
    private Image Block_3;
    private Image Block_4;
    private Image Block_5;
    private Image Block_6;
    private Image Block_0;
    
    public lv1(){
        Block_1 = new ImageIcon(getClass().getResource("Block_1.png")).getImage();
        Block_2 = new ImageIcon(getClass().getResource("Block_2.png")).getImage();
        Block_3 = new ImageIcon(getClass().getResource("Block_3.png")).getImage();
        Block_4 = new ImageIcon(getClass().getResource("Block_4.png")).getImage();
        Block_5 = new ImageIcon(getClass().getResource("Block_5.png")).getImage();
        Block_6 = new ImageIcon(getClass().getResource("Block_6_definitive.gif")).getImage();
        Block_0 = new ImageIcon(getClass().getResource("Block_ladrillo.png")).getImage();
    }
    
    public void dibujar(Graphics g) {
        Graphics2D g1 = (Graphics2D)g;
        Graphics2D g2 = (Graphics2D)g;
        Graphics2D g3 = (Graphics2D)g;
        //Primera fila
        g1.drawImage(Block_1, 100, 10, null);
        g1.drawImage(Block_2, 190, 10, null);
        g1.drawImage(Block_1, 280, 10, null);
        g1.drawImage(Block_2, 370, 10, null);
        g1.drawImage(Block_1, 460, 10, null);
        g1.drawImage(Block_2, 550, 10, null);
        g1.drawImage(Block_1, 640, 10, null);
        //Segunda Fila
        g1.drawImage(Block_3, 100, 35, null);
        g1.drawImage(Block_3, 190, 35, null);
        g1.drawImage(Block_3, 280, 35, null);
        g1.drawImage(Block_3, 370, 35, null);
        g1.drawImage(Block_3, 460, 35, null);
        g1.drawImage(Block_3, 550, 35, null);
        g1.drawImage(Block_3, 640, 35, null);
        //Tercera Fila
        g1.drawImage(Block_2, 100, 60, null);
        g1.drawImage(Block_1, 190, 60, null);
        g1.drawImage(Block_2, 280, 60, null);
        g1.drawImage(Block_1, 370, 60, null);
        g1.drawImage(Block_2, 460, 60, null);
        g1.drawImage(Block_1, 550, 60, null);
        g1.drawImage(Block_2, 640, 60, null);
        //Cuarta Fila
        g1.drawImage(Block_4, 100, 85, null);
        g1.drawImage(Block_4, 190, 85, null);
        g1.drawImage(Block_4, 280, 85, null);
        g1.drawImage(Block_4, 370, 85, null);
        g1.drawImage(Block_4, 460, 85, null);
        g1.drawImage(Block_4, 550, 85, null);
        g1.drawImage(Block_4, 640, 85, null);
        //Quinta Fila
        g1.drawImage(Block_5, 100, 110, null);
        g1.drawImage(Block_5, 190, 110, null);
        g1.drawImage(Block_5, 280, 110, null);
        g1.drawImage(Block_5, 370, 110, null);
        g1.drawImage(Block_5, 460, 110, null);
        g1.drawImage(Block_5, 550, 110, null);
        g1.drawImage(Block_5, 640, 110, null);
        //Sexta Fila
        g1.drawImage(Block_6, 100, 135, null);
        g1.drawImage(Block_6, 190, 135, null);
        g1.drawImage(Block_6, 280, 135, null);
        g1.drawImage(Block_6, 370, 135, null);
        g1.drawImage(Block_6, 460, 135, null);
        g1.drawImage(Block_6, 550, 135, null);
        g1.drawImage(Block_6, 640, 135, null);
        //Septima Fila
        g1.drawImage(Block_3, 100, 160, null);
        g1.drawImage(Block_3, 190, 160, null);
        g1.drawImage(Block_3, 280, 160, null);
        g1.drawImage(Block_3, 370, 160, null);
        g1.drawImage(Block_3, 460, 160, null);
        g1.drawImage(Block_3, 550, 160, null);
        g1.drawImage(Block_3, 640, 160, null);
        //Octava Fila
        g1.drawImage(Block_6, 100, 185, null);
        g1.drawImage(Block_6, 190, 185, null);
        g1.drawImage(Block_6, 280, 185, null);
        g1.drawImage(Block_6, 370, 185, null);
        g1.drawImage(Block_6, 460, 185, null);
        g1.drawImage(Block_6, 550, 185, null);
        g1.drawImage(Block_6, 640, 185, null);
        //Novena Fila
        g1.drawImage(Block_0, 100, 210, null);
        g1.drawImage(Block_0, 190, 210, null);
        g1.drawImage(Block_2, 280, 210, null);
        g1.drawImage(Block_2, 370, 210, null);
        g1.drawImage(Block_2, 460, 210, null);
        g1.drawImage(Block_0, 550, 210, null);
        g1.drawImage(Block_0, 640, 210, null);
        
        
    }
    
}
