package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public static void main(String args[]){
        ElevatorController controller = new ElevatorController(1);

        controller.attach(new ElevatorDisplay(controller));
        controller.attach(new VoiceNotice(controller));
        controller.attach(new FloorDisplay(controller));
        controller.attach(new ControlRoomDisplay(controller));

        controller.gotoFloor(5);


    }
}
