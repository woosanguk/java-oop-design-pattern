package state.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class ON implements State {
    private static ON on = new ON();
    private ON(){}

    public static ON getInstance() {
        return on;
    }
    public void on_button_pushed(Light light) {
        System.out.println("Nothing.");
    }

    public void off_button_pushed(Light light) {
        System.out.println("Light off.");
        light.setState(OFF.getInstance());
    }
}
