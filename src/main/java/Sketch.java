import processing.core.PApplet;
import java.util.ArrayList;

public class Sketch extends PApplet{

    public static final int WIDTH = 850;

    public static final int HEIGHT = 700;

    public static final int height = 700/5;

    ArrayList<Ball> fourBall = new ArrayList<>();
    public static void main(String[] args) {

        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=1;i<5;i++){
            fourBall.add(new Ball(i,0,height*i));
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++){
            fourBall.get(i).draw(this);
            fourBall.get(i).move();
        }
    }
}
