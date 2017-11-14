package strategy.exercise_02;

/**
 * Created by sanguk on 13/11/2017.
 */
public class DiagonalStrategy extends DirectionStrategy {
    public void move(Ball ball) {
        ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);

        while (true){
            ball.setX(ball.getX()+ball.getXInterval());
            ball.setY(ball.getY()+ball.getYInterval());

            if ((ball.getX() < 0) || (ball.getY() < 0) || ball.getX() + Ball.SIZE > BallFrame.WIDTH || ball.getY() + Ball.SIZE > BallFrame.HEIGHT) {
                ball.setIntervals(-ball.getXInterval(), -ball.getYInterval());
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        }
    }
}