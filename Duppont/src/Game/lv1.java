package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Nizzy
 */
public final class lv1 {

    private final Image Block_1;
    private final Image Block_2;
    private final Image Block_3;
    private final Image Block_4;
    private final Image Block_5;
    private final Image Block_6;
    private final Image Block_0;
    private final ResourcesBrick resources;
     private final int TX=85;//tamaño del ladrillo en X
    private final int TY=35;//tamaño del ladrillo en Y
    //private int [][] lv1={1,2,4,0,2,4,2,4,3,2,3,1,2,1,2,1,2,3,2,0,1,2,2,4,2,1,2,1
    //private int CX[]={85,175,265,355,445,535,625};//coordenada x
    private int CX[]={85,175,265,355,445,535,625};
    
     //private int CY[]={10,35,60,85,110,130};
    private int CY[]={10,50,90,130,170,210};//185,210   coordenada y
    
   private int LV1[][]={{1,2,3,0,2,3,2},{3,3,2,3,1,2,1},{2,1,2,3,2,0,1},{2,2,0,2,1,2,1},{1,2,0,0,2,3,2},{1,3,2,3,1,2,1}};
   private int LV2[][]={{1,2,4,0,2,4,2},{4,3,2,3,1,2,1},{2,1,2,3,2,0,1},{2,2,4,2,1,2,1},{4,3,2,3,1,2,1},{2,1,2,3,2,0,1}};
   private int LV3[][]={{2,1,2,3,2,0,1},{2,2,4,2,1,2,1},{2,2,4,2,1,2,1},{2,2,4,2,1,2,1},{4,3,2,3,1,2,1},{2,1,2,3,2,0,1}};
   // private int LV1Estados[]=new int[28];
   

    public lv1() {

        resources = new ResourcesBrick();
        resources.setRuta("/Images/");
        resources.Audio("/Audios/", "GRGE", ".wav");
        //136.000ms

        Block_1 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_1.png")).getImage();
        Block_2 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_2.png")).getImage();
        Block_3 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_3.png")).getImage();
        Block_4 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_4.png")).getImage();
        Block_5 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_5.png")).getImage();
        Block_6 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_6_definitive.gif")).getImage();
        Block_0 = new ImageIcon(getClass().getResource(resources.getRuta() + "Block_ladrillo.png")).getImage();

    }

    public void dibujar(Graphics g) {
        Graphics2D g1 = (Graphics2D) g;
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;
        for(int i=0;i<6;i++){
          for(int j=0;j<7;j++){
             if(LV1[i][j]==1){
                g1.drawImage(Block_1, CX[j], CY[i],TX,TY, null); 
             //   VidasL[i][j]=1;
             }
            else if(LV1[i][j]==2){
                g1.drawImage(Block_2, CX[j], CY[i],TX,TY, null);  
                 //VidasL[i][j]=2;
             }
            else if(LV1[i][j]==3){
                g1.drawImage(Block_3, CX[j], CY[i],TX,TY, null);  
                 //VidasL[i][j]=3;
             }
              else if(LV1[i][j]==4){
                g1.drawImage(Block_4, CX[j], CY[i],TX,TY, null); 
               //  VidasL[i][j]=4;
             }
          }
      }
    }
    public int[] GetCX(){
        return CX;
    }
    public int[] GetCY(){
        return CY;
    }
    public int[][] GetLevel1(){
        return LV1;
    }
    
    }


