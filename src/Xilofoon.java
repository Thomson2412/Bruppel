import processing.core.PApplet;
import processing.sound.SinOsc;

public class Xilofoon extends Instrument{

    private final SinOsc root, sec, third;

    public Xilofoon(PApplet pApplet){
        super(pApplet);

        root = new SinOsc(pApplet);
        sec = new SinOsc(pApplet);
        third = new SinOsc(pApplet);
        root.amp(VOLUME);
        sec.amp(VOLUME);
        third.amp(VOLUME);
    }

    @Override
    public void play(){
        root.freq(AgentUtils.getRandomFreq(Scale.chinese, 2,5));
        envelope.play(root, attackTime, sustainTime, sustainLevel, releaseTime);

        pApplet.delay(AgentUtils.getRandomNumber(0, 150));
        sec.freq(AgentUtils.getRandomFreq(Scale.chinese, 2,5));
        envelope.play(sec, attackTime, sustainTime, sustainLevel, releaseTime);

        pApplet.delay(AgentUtils.getRandomNumber(0, 150));
        third.freq(AgentUtils.getRandomFreq(Scale.chinese, 2,5));
        envelope.play(third, attackTime, sustainTime, sustainLevel, releaseTime);
    }
}
