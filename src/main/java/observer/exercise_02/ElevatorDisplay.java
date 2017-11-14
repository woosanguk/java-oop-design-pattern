package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorDisplay implements Observer {
    private ElevatorController controller;
    public ElevatorDisplay(ElevatorController controller){
        this.controller = controller;
    }
    public void update() {
        System.out.println("ElevatorDisplay : " + this.controller.getCurFloor());
    }
}
