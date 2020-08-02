import processing.core.PApplet;
import processing.sound.*;

public class Clarinet extends Instrument{

    private final TriOsc root;
    private final WhiteNoise blow;
    private final LowPass lowPass;
    Reverb reverb;


    public Clarinet(PApplet pApplet){
        super(pApplet);

        root = new TriOsc(pApplet);
        blow = new WhiteNoise(pApplet);
        lowPass = new LowPass(pApplet);
        reverb = new Reverb(pApplet);

        root.amp(VOLUME);
        blow.amp(VOLUME);
        lowPass.process(blow, 500);
        reverb.set(0.5f,0.5f,0.5f);
        reverb.process(root);
    }

    @Override
    public void play(){
        root.freq(AgentUtils.getRandomFreq(Scale.chinese, 1,2));
        envelope.play(root, 0.5f, 0.8f, 0.5f, 0.1f);
        envelope.play(blow, 0.5f, 0.5f, 0.7f, 0.2f);
    }
}
