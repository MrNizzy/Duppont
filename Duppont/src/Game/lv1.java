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
        g1.drawImage(Block_1, 85, 10, null);
        g1.drawImage(Block_2, 175, 10, null);
        g1.drawImage(Block_1, 265, 10, null);
        g1.drawImage(Block_2, 355, 10, null);
        g1.drawImage(Block_1, 445, 10, null);
        g1.drawImage(Block_2, 535, 10, null);
        g1.drawImage(Block_1, 625, 10, null);
        //Segunda Fila
        g1.drawImage(Block_3, 85, 35, null);
        g1.drawImage(Block_3, 175, 35, null);
        g1.drawImage(Block_3, 265, 35, null);
        g1.drawImage(Block_3, 355, 35, null);
        g1.drawImage(Block_3, 445, 35, null);
        g1.drawImage(Block_3, 535, 35, null);
        g1.drawImage(Block_3, 625, 35, null);
        //Tercera Fila
        g1.drawImage(Block_2, 85, 60, null);
        g1.drawImage(Block_1, 175, 60, null);
        g1.drawImage(Block_2, 265, 60, null);
        g1.drawImage(Block_1, 355, 60, null);
        g1.drawImage(Block_2, 445, 60, null);
        g1.drawImage(Block_1, 535, 60, null);
        g1.drawImage(Block_2, 625, 60, null);
        //Cuarta Fila
        g1.drawImage(Block_4, 85, 85, null);
        g1.drawImage(Block_4, 175, 85, null);
        g1.drawImage(Block_4, 265, 85, null);
        g1.drawImage(Block_4, 355, 85, null);
        g1.drawImage(Block_4, 445, 85, null);
        g1.drawImage(Block_4, 535, 85, null);
        g1.drawImage(Block_4, 625, 85, null);
        //Quinta Fila
        g1.drawImage(Block_5, 85, 110, null);
        g1.drawImage(Block_5, 175, 110, null);
        g1.drawImage(Block_5, 265, 110, null);
        g1.drawImage(Block_5, 355, 110, null);
        g1.drawImage(Block_5, 445, 110, null);
        g1.drawImage(Block_5, 535, 110, null);
        g1.drawImage(Block_5, 625, 110, null);
        //Sexta Fila
        g1.drawImage(Block_6, 85, 135, null);
        g1.drawImage(Block_6, 175, 135, null);
        g1.drawImage(Block_6, 265, 135, null);
        g1.drawImage(Block_6, 355, 135, null);
        g1.drawImage(Block_6, 445, 135, null);
        g1.drawImage(Block_6, 535, 135, null);
        g1.drawImage(Block_6, 625, 135, null);
        //Septima Fila
        g1.drawImage(Block_3, 85, 160, null);
        g1.drawImage(Block_3, 175, 160, null);
        g1.drawImage(Block_3, 265, 160, null);
        g1.drawImage(Block_3, 355, 160, null);
        g1.drawImage(Block_3, 445, 160, null);
        g1.drawImage(Block_3, 535, 160, null);
        g1.drawImage(Block_3, 625, 160, null);
        //Octava Fila
        g1.drawImage(Block_6, 85, 185, null);
        g1.drawImage(Block_6, 175, 185, null);
        g1.drawImage(Block_6, 265, 185, null);
        g1.drawImage(Block_6, 355, 185, null);
        g1.drawImage(Block_6, 445, 185, null);
        g1.drawImage(Block_6, 535, 185, null);
        g1.drawImage(Block_6, 625, 185, null);
        //Novena Fila
        g1.drawImage(Block_0, 85, 210, null);
        g1.drawImage(Block_0, 175, 210, null);
        g1.drawImage(Block_2, 265, 210, null);
        g1.drawImage(Block_2, 355, 210, null);
        g1.drawImage(Block_2, 445, 210, null);
        g1.drawImage(Block_0, 535, 210, null);
        g1.drawImage(Block_0, 625, 210, null);
        
        
    }
    
}
