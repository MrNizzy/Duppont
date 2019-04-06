package Game;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ResourcesBrick {

    public Clip clip;
    public String ruta;
    public String musica[] = {"InGame", "OdioANed", "InGame", "MatarPorLaVida", "OdioANed", "InGame", "MatarPorLaVida", "OdioANed", "InGame"};
    public String sonidos[] = {"Pdemonio", "Flanders", "chango", "barra","Pdemonio", "Flanders", "chango", "barra"};
    public int random;
    public int microSeg;

    public ResourcesBrick() {
    }

    public int RandomSong() {
        random = (int)( Math.random() * 8) + 1;
        return random;
    }

    public int RandomBrick() {
        random = (int)( Math.random() * 7) + 1;
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

}
