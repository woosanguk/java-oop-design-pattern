package command.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class AlarmOnCommand implements Command {
    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm){
        this.alarm = alarm;
    }

    public void execute() {
        this.alarm.start();
    }
}
