package command.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public Client() {
    }

    public static void main(String args[]) {
        ElevatorController controller1 = new ElevatorController(1);
        ElevatorController controller2 = new ElevatorController(2);

        ElevatorManager em = new ElevatorManager(2);
        em.addController(controller1);
        em.addController(controller2);

        Command destinationCommand1stController = new DestinationSelectionCommand(1, controller1);
        ElevatorButton destinationButton1stFloor = new ElevatorButton(destinationCommand1stController);
        destinationButton1stFloor.pressed();

        Command destinationCommand2stController = new DestinationSelectionCommand(2, controller2);
        ElevatorButton destinationButton2stFloor = new ElevatorButton(destinationCommand2stController);
        destinationButton2stFloor.pressed();

        Command requestDownCommand = new ElevatorRequestCommand(2, ElevatorDirection.DOWN, em);
        ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(requestDownCommand);
        requestDownFloorButton2ndFloor.pressed();
    }
}
