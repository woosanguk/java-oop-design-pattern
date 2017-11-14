package command.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorRequestCommand implements Command {
    private int destination;
    private ElevatorDirection direction;
    private ElevatorManager manager;

    public ElevatorRequestCommand(int destination, ElevatorDirection direction, ElevatorManager controller){
        this.destination = destination;
        this.direction = direction;
        this.manager = controller;
    }
    public void execute() {
        manager.requestElevator(destination, direction);
    }
}
