package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class FloorDisplay implements Observer {
    private ElevatorController controller;
    public FloorDisplay(ElevatorController controller){
        this.controller = controller;
    }
    public void update() {
        System.out.println("FloorDisplay : " + this.controller.getCurFloor());
    }
}
