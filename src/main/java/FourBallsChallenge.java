import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsChallenge extends PApplet {

    private static final Screen screen = new Screen(640, 480);
    private static final int DISTANCE_FACTOR = 5;
    private static ArrayList<Ball> fourBalls;


    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        size(screen.getWidth(), screen.getHeight());
    }

    @Override
    public void setup(){
        initializeBalls();
    }

    @Override
    public void draw() {
        drawAllBalls();
    }

    private static void initializeBalls() {
        fourBalls = new ArrayList<>();
        float ballStartingPosX = 0;
        for(int ballNumber = 1; ballNumber <= 4; ballNumber++) {
            float distanceFromTop = ballNumber * ((float) screen.getHeight() / DISTANCE_FACTOR);
            int currentBallSpeed = ballNumber;
            Ball ball = new Ball(ballStartingPosX, distanceFromTop, currentBallSpeed);
            fourBalls.add(ball);
        }
    }

    private void drawAllBalls() {
        for(Ball ball : fourBalls){
            ball.drawBall(this);
        }
    }
}
