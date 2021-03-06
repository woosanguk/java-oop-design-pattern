package observer.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        Battery battery = new Battery();
        battery.attach(new BatteryLevelDisplay(battery));
        battery.attach(new LowBatteryWarning(battery));

        battery.consume(20);
        battery.consume(50);
        battery.consume(10);

    }
}
