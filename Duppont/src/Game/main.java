package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Nizzy
 */
public class main {

    public static void main(String[] args) {
        
        String Name;
        Name = JOptionPane.showInputDialog(null, "Digite su nombre de jugador: ");
        Ventana game = new Ventana();
        game.jugador(Name);
        game.setVisible(true);
        Timer timer;
        boolean fin = false;

        timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (game.FinDelJuego == true) {
                    game.dispose();
                    game.setFinDelJuego();
                    System.runFinalization();
                    Ventana juego = new Ventana();
                    juego.setVisible(true);
                    juego.setFinDelJuego();
                }
            }
        });
        timer.start();
    }

}
