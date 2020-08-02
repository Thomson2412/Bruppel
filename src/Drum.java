import processing.core.PApplet;
import processing.sound.SoundFile;

import java.io.File;

public class Drum extends Instrument{

    private final File[] kickList;
    private final File[] snareList;
    private final File[] hatList;

    public Drum(PApplet pApplet){
        super(pApplet);
        String kickPath = pApplet.sketchPath() + "/src/sounds/kick/";
        String snarePath = pApplet.sketchPath() + "/src/sounds/snare/";
        String hatPath = pApplet.sketchPath() + "/src/sounds/hat/";

        kickList = pApplet.listFiles(kickPath);
        snareList = pApplet.listFiles(snarePath);
        hatList = pApplet.listFiles(hatPath);
    }

    @Override
    public void play(){
        SoundFile file;
        switch (AgentUtils.getRandomNumber(0, 3)) {
            case 0 -> file = new SoundFile(pApplet, snareList[AgentUtils.getRandomNumber(0, snareList.length)].toString());
            case 1 -> file = new SoundFile(pApplet, hatList[AgentUtils.getRandomNumber(0, hatList.length)].toString());
            default -> file = new SoundFile(pApplet, kickList[AgentUtils.getRandomNumber(0, kickList.length)].toString());
        }
        file.amp(0.3f);
        file.rate(AgentUtils.getRandomNumber(0, 3) + 0.1f);
        file.play();
    }
}
