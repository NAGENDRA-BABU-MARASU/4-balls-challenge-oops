import processing.core.PApplet;

import java.util.ArrayList;

public class FourBallsChallenge extends PApplet {

    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 480;
    private static final int DISTANCE_FACTOR = 5;
    private static ArrayList<Ball> fourBalls;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    private static void initializeBalls() {
        fourBalls = new ArrayList<>();
        float ballStartingPosX = 0;
        for(int ballNumber = 1; ballNumber <= 4; ballNumber++) {
            float distanceFromTop = ballNumber * ((float) SCREEN_HEIGHT / DISTANCE_FACTOR);
            int currentBallSpeed = ballNumber;
            Ball ball = new Ball(ballStartingPosX, distanceFromTop, currentBallSpeed);
            fourBalls.add(ball);
        }
    }

    @Override
    public void settings() {
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
        initializeBalls();
    }

    @Override
    public void draw() {
        drawAllBalls();
    }

    private void drawAllBalls() {
        for(Ball ball : fourBalls){
            ball.drawBall(this);
        }
    }
}
