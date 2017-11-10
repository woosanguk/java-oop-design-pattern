package state.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Light {
    private State state;

    public Light(){
        this.state = OFF.getInstance();
    }

    public void on_button_pushed() {
        this.state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        this.state.off_button_pushed(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
