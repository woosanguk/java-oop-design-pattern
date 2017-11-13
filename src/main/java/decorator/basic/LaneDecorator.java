package decorator.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class LaneDecorator extends DisplayDecorator {
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    public void draw(){
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("Draw Lane");
    }
}
