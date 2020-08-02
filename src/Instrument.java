import processing.core.PApplet;
import processing.sound.Env;

public class Instrument {

    protected final PApplet pApplet;

    protected final Env envelope;

    protected static final float VOLUME = 0.1f;
    protected static final float attackTime = 0.2f;
    protected static final float sustainTime = 0.4f;
    protected static final float sustainLevel = 0.8f;
    protected static final float releaseTime = 0.6f;

    public Instrument(PApplet pApplet){
        this.pApplet = pApplet;
        envelope = new Env(pApplet);
    }

    public void play(){};
}
