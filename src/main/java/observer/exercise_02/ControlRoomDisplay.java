package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ControlRoomDisplay implements Observer {
    private ElevatorController controller;
    public ControlRoomDisplay(ElevatorController controller){
        this.controller = controller;
    }
    public void update() {
        System.out.println("ControlRoomDisplay : " + this.controller.getCurFloor());
    }
}
