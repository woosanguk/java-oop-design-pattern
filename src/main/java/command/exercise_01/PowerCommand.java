package command.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class PowerCommand implements Command {
    private TV tv;

    public PowerCommand(TV tv){
        this.tv = tv;
    }
    public void execute() {
        tv.power();
    }
}
