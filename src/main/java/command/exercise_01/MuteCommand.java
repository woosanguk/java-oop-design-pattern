package command.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class MuteCommand implements Command{
    private TV tv;

    public MuteCommand(TV tv){
        this.tv = tv;
    }
    public void execute() {
        tv.mute();
    }
}
