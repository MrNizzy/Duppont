package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Nizzy
 */
public final class lv1 {

    public boolean GameOverBoolean = false;
    private final Image Block_1;
    private final Image Block_2;
    private final Image Block_3;
    private final Image Block_4;
    private final Image Block_5;
    private final Image Block_6;
    private final Image Block_0;
    private final Image GameOver;
    private final ResourcesBrick resources;
    int ancho, alto;
    String SegundosSet = "0";
    int TimeOut = 5;
    Timer tiempo;

    private final int TX = 85;//tamaño del ladrillo en X
    private final int TY = 35;//tamaño del ladrillo en Y
    //private int [][] lv1={1,2,4,0,2,4,2,4,3,2,3,1,2,1,2,1,2,3,2,0,1,2,2,4,2,1,2,1
    //private int CX[]={85,175,265,355,445,535,625};//coordenada x
    private int CX[] = {85, 175, 265, 355, 445, 535, 625};

    //private int CY[]={10,35,60,85,110,130};
    private final int CY[] = {10, 50, 90, 130, 170, 210};//185,210   coordenada y

    private final int LV1[][] = {{2, 2, 2, 2, 2, 2, 2}, {2, 2, 7, 2, 7, 2, 2}, {2, 1, 2, 2, 2, 1, 2}, {3, 2, 1, 2, 1, 2, 3}, {3, 2, 2, 1, 2, 2, 3}, {3, 3, 2, 2, 2, 3, 3}};
    //private final int LV1[][] = {{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0}};
    // private final int LV2[][] = {{1, 2, 4, 0, 2, 4, 2}, {4, 3, 2, 3, 1, 2, 1}, {2, 1, 2, 3, 2, 0, 1}, {2, 2, 4, 2, 1, 2, 1}, {4, 3, 2, 3, 1, 2, 1}, {2, 1, 2, 3, 2, 0, 1}};

    private final int LV2[][] = {{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}};
    //private final int LV3[][] = {{2, 1, 2, 3, 2, 0, 1}, {2, 2, 4, 2, 1, 2, 1}, {2, 2, 4, 2, 1, 2, 1}, {2, 2, 4, 2, 1, 2, 1}, {4, 3, 2, 3, 1, 2, 1}, {2, 1, 2, 3, 2, 0, 1}};
    private final int LV3[][] = {{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}};
    // private int LV1Estados[]=new int[28];

    public lv1() {

        resources = new ResourcesBrick();
        resources.setRuta("/Images/");
        resources.AudioMain("/Audios/", "InGame", ".wav");
        //136.000ms

        GameOver = new ImageIcon(getClass().getResource(resources.getRuta() + "GameOver.png")).getImage();
        Block_1 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_1.png")).getImage();
        Block_2 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_2.png")).getImage();
        Block_3 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_3.png")).getImage();
        Block_4 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_4.png")).getImage();
        Block_5 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_5.png")).getImage();
        Block_6 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_6_definitive.gif")).getImage();
        Block_0 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_ladrillo.png")).getImage();

        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TimeOut >= 0) {
                    DisminuirTiempo();
                } else {
                    tiempo.stop();
                }

            }
        });

    }
    ////////////////////////////////////////////////////////////////////////////////////////

    public void dibujar(Graphics g, int level[][]) {
        Graphics2D g1 = (Graphics2D) g;
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                switch (level[i][j]) {
                    case 1:
                        g1.drawImage(Block_1, CX[j], CY[i], TX, TY, null);
                        break;
                    case 2:
                        g1.drawImage(Block_2, CX[j], CY[i], TX, TY, null);
                        break;
                    case 3:
                        g1.drawImage(Block_3, CX[j], CY[i], TX, TY, null);
                        break;
                    case 4:
                        g1.drawImage(Block_4, CX[j], CY[i], TX, TY, null);
                        //  VidasL[i][j]=4;
                        break;
                    default:
                        break;
                }
            }
        }
        if (GameOverBoolean == true) {
            SegundosSet = Integer.toString(TimeOut);
            g1.setColor(Color.BLACK);
            g1.fillRect(0, 0, 900, 900);
            g1.drawImage(GameOver, ancho, alto, null);
            g.setFont(new Font("Impact", Font.PLAIN, 40));
            g1.setColor(Color.decode("#ffff66"));
            g1.drawString("El Juego se cierra en:", 150, 250);
            tiempo.start();
            if (TimeOut >= 0) {
                g1.drawString(SegundosSet + " seg", 250, 300);
            }
            
        }
    }

    public int[] GetCX() {
        return CX;
    }

    public int[] GetCY() {
        return CY;
    }

    public int[][] GetLevel1() {
        return LV1;
    }

    public int[][] GetLevel2() {
        return LV2;
    }

    public int[][] GetLevel3() {
        return LV3;
    }

    public void ChangeGame() {
        GameOverBoolean = true;
    }

    //////////////////////////////////////////////      
    public void setAncho(int ancho) {
        this.ancho = ancho;
        System.out.println("Ancho: " + ancho);
    }

    public void setAlto(int alto) {
        this.alto = alto;
        System.out.println("Alto: " + alto);
    }

    public void DisminuirTiempo() {
        TimeOut = TimeOut - 1;
    }
}
