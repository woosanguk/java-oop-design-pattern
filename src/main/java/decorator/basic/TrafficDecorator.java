package decorator.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class TrafficDecorator extends DisplayDecorator {
    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }
    public void draw(){
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("Draw Traffic");
    }
}
