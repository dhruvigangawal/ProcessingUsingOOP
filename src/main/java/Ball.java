public class Ball{
    private final int speed;
    private final int diameter;
    private int x;
    private final int y;

    public Ball(int speed, int x, int y){
        this.speed = speed;
        this.x =x;
        this.y = y;
        this.diameter = 15;
    }

    public void move() {
        x+=speed;
    }

    public void draw(Sketch Aaplet){

        Aaplet.ellipse(x,y,diameter,diameter);
    }
}
