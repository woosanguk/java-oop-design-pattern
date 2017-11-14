package strategy.exercise_02;

/**
 * Created by sanguk on 13/11/2017.
 */
public class VerticalMoveStrategy extends DirectionStrategy{
    public void move(Ball ball) {
        ball.setIntervals(0, Ball.INTERVAL);
        while (true){
            ball.setY(ball.getY()+ball.getYInterval());
            if ((ball.getY() < 0) || ((ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15) && ball.getYInterval() > 0)) {
                ball.setIntervals(0, -ball.getYInterval());
            }
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {

            }
        }

    }
}
