package state.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        Light light = new Light();

        light.on_button_pushed();
        light.on_button_pushed();

        light.off_button_pushed();
        light.off_button_pushed();
    }
}
