import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet{

    private PImage background;
    private AgentBertus brutes;

    public static void main(String... args){
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        size(800, 800);
        background = loadImage("0lBP1x7.jpg");
        background.resize(800, 800);

        brutes = new AgentBertus(this);
    }

    @Override
    public void draw() {
        background(background);

        brutes.makeSound();
        delay(AgentUtils.getRandomNumber(100, 500));
    }

}
