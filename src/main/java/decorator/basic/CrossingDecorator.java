package decorator.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class CrossingDecorator extends DisplayDecorator {

    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("Draw Crossing");
    }
}
