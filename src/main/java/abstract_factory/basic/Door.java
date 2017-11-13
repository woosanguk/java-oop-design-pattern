package abstract_factory.basic;

import template_method.basic.DoorStatus;

/**
 * Created by sanguk on 13/11/2017.
 */
public abstract class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return this.doorStatus;
    }

    public void close() {
        if (doorStatus == DoorStatus.CLOSED){
            return;
        }
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open() {
        if (doorStatus == DoorStatus.OPEND) {
            return;
        }
        doOpen();
        doorStatus = DoorStatus.OPEND;
    }

    protected abstract void doOpen();
}
