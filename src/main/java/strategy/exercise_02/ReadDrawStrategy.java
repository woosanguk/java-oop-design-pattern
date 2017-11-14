package strategy.exercise_02;

import java.awt.*;

/**
 * Created by sanguk on 13/11/2017.
 */
public class ReadDrawStrategy extends DrawStrategy {
    public void draw(Ball ball) {
        ball.setColor(Color.RED);
    }
}
