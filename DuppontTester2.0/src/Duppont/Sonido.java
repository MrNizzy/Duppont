package Duppont;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Raúl García Cortés
 * @e-mail GarciaCortes.Raul@gmail.com
 * @version 2014.06.22
 */

public class Sonido {
    private AudioFileFormat aff;
    private AudioInputStream ais;
    private File sf;
    
    public Sonido(String ruta)
    {
        sf = new File(ruta);
    }

    Sonido() {
        //throw new UnsupportedOperationException("No soportado :("); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    public void reproducir()
    {
     try
     {
       aff = AudioSystem.getAudioFileFormat(sf); 
       ais = AudioSystem.getAudioInputStream(sf);
            
       AudioFormat af = aff.getFormat(); 
            
       DataLine.Info info=new DataLine.Info(Clip.class,ais.getFormat(), 
                        ((int) ais.getFrameLength()*af.getFrameSize())); 
            
       Clip audio = (Clip)AudioSystem.getLine(info);
       audio.open(ais);
       audio.loop(0);
     }   
      
   catch(UnsupportedAudioFileException ee){} 
   catch(IOException ea){} 
   catch(LineUnavailableException LUE){}              
 }
}
