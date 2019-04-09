package Game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ResourcesBrick {

    public Clip clip;
    public String ruta;
    public String musica[] = {"HappyTogether", "OdioANed"};
    public String sonidos[] = {"Pdemonio", "Flanders", "chango", "barra", "Pdemonio", "Flanders", "chango", "barra"};
    public int random;
    public int microSeg;
    private final String[] Texto = new String[900];
    int puntaje = 0;

    public ResourcesBrick() {

    }

    public int RandomSong() {
        random = (int) (Math.random() * 2);
        return random;
    }

    public int RandomBrick() {
        random = (int) (Math.random() * 7) + 1;
        return random;
    }

    public void Audio(String Ruta, String audio, String Ext) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + audio + Ext)));
            clip.start();
        } catch (Exception e) {
        }
    }

    public void AudioColi(String Ruta, String Ext) {
        try {
            RandomBrick();
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + sonidos[random] + Ext)));
            clip.start();
        } catch (Exception e) {
        }
    }

    public void AudioMain(String Ruta, String audio, String Ext) {
        try {
            RandomSong();
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + musica[random] + Ext)));
            microSeg = (int) clip.getMicrosecondLength();
            clip.loop(1000);
            clip.start();
            System.out.println(random);

        } catch (Exception e) {
        }
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void EscribirPuntaje(String NPlayer, int Puntuacion) {
        try {
            FileWriter fstream = new FileWriter("Score.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(NPlayer + ": " + Puntuacion + " points");
            out.newLine();
            out.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void LeerPuntajes() {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        int i = 0;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("Score.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                Texto[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public String ScoreLinea(int a) {
        String Text;
        Text = Texto[a];
        return Text;
    }

    public void verPuntaje() {
        System.out.println("El puntaje actual es: " + puntaje);
    }

    public int RandomPuntaje() {
        random = (int) (Math.random() * 10) + 1;
        return random;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    

}
