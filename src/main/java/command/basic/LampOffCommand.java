package command.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class LampOffCommand implements Command {
    private Lamp lamp;
    LampOffCommand(Lamp lamp){
        this.lamp = lamp;
    }
    public void execute() {
        lamp.turnOff();
    }
}
