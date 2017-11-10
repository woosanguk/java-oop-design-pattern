package state.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public interface State {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}
