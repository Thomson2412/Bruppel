import processing.core.PApplet;

public class AgentBertus {

    private final Instrument clari;
    private final Instrument xili;
    private final Instrument drum;

    public AgentBertus(PApplet pApplet){
        clari = new Clarinet(pApplet);
        xili = new Xilofoon(pApplet);
        drum = new Drum(pApplet);
    }

    public void makeSound(){
        clari.play();
        xili.play();
        drum.play();
    }

}