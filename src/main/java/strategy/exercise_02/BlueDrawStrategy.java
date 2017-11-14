package strategy.exercise_02;

import java.awt.*;

/**
 * Created by sanguk on 13/11/2017.
 */
public class BlueDrawStrategy extends DrawStrategy {
    public void draw(Ball ball) {
        ball.setColor(Color.BLUE);
    }
}
