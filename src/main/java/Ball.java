import processing.core.PApplet;

public class Ball {

    private static final int BALL_WIDTH = 10;
    private static final int BALL_HEIGHT = 10;
    private float posX;
    private final float posY;
    private final int ballSpeed;


    public Ball(float posX, float posY, int ballSpeed) {
        this.posX = posX;
        this.posY = posY;
        this.ballSpeed = ballSpeed;
    }

    public void drawBall(PApplet pApplet){
        pApplet.ellipse(posX, posY, BALL_WIDTH, BALL_HEIGHT);
        moveRight();
    }

    public void moveRight() {
        this.posX += ballSpeed;
    }
}
