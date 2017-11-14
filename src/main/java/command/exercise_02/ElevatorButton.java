package command.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorButton {
    private Command command;
    public ElevatorButton(Command command){
        this.command = command;
    }

    public void pressed(){
        command.execute();
    }
}
