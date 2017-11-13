package template_method.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Door {
    private DoorStatus doorStatus;

    public Door(){
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return this.doorStatus;
    }

    public void close () {
        doorStatus = DoorStatus.CLOSED;
    }

    public void open () {
        doorStatus = DoorStatus.OPEND;
    }
}
