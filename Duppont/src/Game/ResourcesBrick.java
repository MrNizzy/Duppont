package Game;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ResourcesBrick {

    public Clip clip;
    public String ruta;

    public ResourcesBrick() {
    }

    public void Audio(String Ruta, String audio, String Ext) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + audio + Ext)));
            clip.start();
        } catch (Exception e) {
        }
    }

    public void AudioMain(String Ruta, String audio, String Ext) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Ruta + audio + Ext)));
            clip.loop(1000);
            clip.start();
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
