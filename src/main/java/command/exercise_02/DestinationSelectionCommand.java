package command.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class DestinationSelectionCommand implements Command {

    private int destination;
    private ElevatorController controller;
    public DestinationSelectionCommand(int destination, ElevatorController controller){
        this.destination = destination;
        this.controller = controller;
    }
    public void execute() {
        controller.gotoFloor(destination);
    }
}
