package state.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class OFF implements State {
    static private OFF off = new OFF();
    private OFF(){}

    public static OFF getInstance(){
        return off;
    }

    public void on_button_pushed(Light light) {
        System.out.println("Light off.");
        light.setState(ON.getInstance());
    }

    public void off_button_pushed(Light light) {
        System.out.println("Nothing.");
    }
}
