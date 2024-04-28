package HumanLifeSimulator;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    public static void playMusic(String path, boolean loop){
        try{
            File audio = new File(path);
            if (audio.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                if(loop){
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                }
                clip.start();
            } else {
                System.out.println("Can't find file");
            }
        }catch (Exception e) {
            System.out.println("Erro ao reproduzir a musica");
        }
    }
}
