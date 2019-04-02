package Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
        nivel1=new lv1();
        
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
        mipelota.reflejar();
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
