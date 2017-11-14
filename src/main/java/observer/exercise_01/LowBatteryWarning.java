package observer.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class LowBatteryWarning implements Observer {
    private static final int LOW_BATTERY = 30;
    private Battery battery;
    public LowBatteryWarning(Battery battery){
        this.battery = battery;
    }

    public void update(){
        int level = this.battery.getLevel();
        if (level < LOW_BATTERY){
            System.out.println("<Warning> Low Battery: " + level + " Compared with " + LOW_BATTERY);
        }
    }
}
