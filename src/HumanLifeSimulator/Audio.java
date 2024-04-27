package HumanLifeSimulator;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    public static void playMusic(String path){
        try{
            File audio = new File(path);
            if (audio.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {

            }
        }catch (Exception e) {
            System.out.println("erro");
        }
    }
}
