package observer.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class BatteryLevelDisplay implements Observer {
    private Battery battery;

    public BatteryLevelDisplay(Battery battery){
        this.battery = battery;
    }

    public void update(){
        int level = battery.getLevel();
        System.out.println("Level: " + level);
    }
}
