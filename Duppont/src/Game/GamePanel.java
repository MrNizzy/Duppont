package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Nizzy
 */
public class GamePanel extends JPanel{

    private int x, y;
    private final double Panel_Width;
    private final double Panel_Height;
    private int Score;
    private final Timer timer;
    private Pelota mipelota;
    Barra barra;
    private final lv1 nivel1;
    lv1 niveles=new lv1();
  //  private int ladrillos[9][7];
    
    int Estados[][]=niveles.GetLevel1();
    public GamePanel(Dimension d, int tamanio) {
        //Propiedades de la ventana
        this.setSize(d);
        this.setPreferredSize(d);
        Panel_Width = d.getWidth();
        Panel_Height = d.getHeight();
        this.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        this.setBackground(new Color(225, 209, 242));
        setLayout(null);
        

        //Objetos
        mipelota = new Pelota(20, 20, tamanio);
        mipelota.LimitesXY(getWidth(), getHeight());
        barra=new Barra(300,(int)Panel_Height-20);
        barra.setLayout(null);
        
        
        add(barra);
        // Para la animación de la pelota
        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mipelota.traslacion(x,y);

                repaint();
               
            }
        });
    }
    void colision (){
   
    if((mipelota.GetXP()>=barra.GetXB())&  //b->balon  p->pelota
		   ( mipelota.GetXP()<=barra.GetXB()+barra.getAncho())&
		    (mipelota.GetYP()+barra.getAlto()>=barra.GetYB())){
        mipelota.reflejarY();
}
}
void colisionL(int[] CX,int[] CY,int[][] estados){ 
  for(int i=0;i<6;i++){
    for(int j=0;j<7;j++){
      if(estados[i][j]>0){
        boolean CN = new Rectangle(CX[j],CY[i],85,5).intersects(new Rectangle(mipelota.GetXP(),mipelota.GetYP(),15,15));
        boolean CI = new Rectangle(CX[j],CY[i],10,35).intersects(new Rectangle(mipelota.GetXP(),mipelota.GetYP(),15,15));
        boolean CD = new Rectangle(CX[j]+85,CY[i],10,35).intersects(new Rectangle(mipelota.GetXP(),mipelota.GetYP(),15,15));
        boolean CS = new Rectangle(CX[j],CY[i]+35,85,10).intersects(new Rectangle(mipelota.GetXP(),mipelota.GetYP(),15,15));
            if(CN){//si colosiona con el lado superiror.
                if(estados[i][j] < 4){//dibuja una explosion si el bloque no es indestructible (valor 4)
                    mipelota.reflejarY();
                    estados[i][j]=estados[i][j]-1;
                }
             }
            if(CI){//si colosiona con el lado superiror.
                if(estados[i][j] < 4){//dibuja una explosion si el bloque no es indestructible (valor 4)
                    mipelota.reflejarX();
                    estados[i][j]=estados[i][j]-1;
                }
            }
            if(CS){//si colosiona con el lado superiror.
                if(estados[i][j] < 4){//dibuja una explosion si el bloque no es indestructible (valor 4)
                    mipelota.reflejarY();
                    estados[i][j]=estados[i][j]-1;
                }
            }
            if(CD){//si colosiona con el lado superiror.
                if(estados[i][j] < 4){//dibuja una explosion si el bloque no es indestructible (valor 4)
                    mipelota.reflejarX();
                    estados[i][j]=estados[i][j]-1;
                }
            }
        }
      }
      
    }
}    

    public double getPanel_Width() {
        return Panel_Width;
    }

    public double getPanel_Height() {
        return Panel_Height;
    }

    @Override
    public void paint(Graphics g) {
        //Fondo
        super.paint(g);
        
        g.setColor(Color.decode("#ff6600"));
        Graphics2D g2 = (Graphics2D)g;
        Graphics2D g3 = (Graphics2D)g;
        colision();
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
