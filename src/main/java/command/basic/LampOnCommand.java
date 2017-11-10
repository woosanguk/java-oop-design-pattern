package command.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class LampOnCommand implements Command {
    private Lamp lamp;
    public LampOnCommand(Lamp lamp){
        this.lamp = lamp;
    }
    public void execute() {
        this.lamp.turnOn();
    }
}
