package abstract_factory.basic;

import template_method.basic.DoorStatus;
import template_method.basic.MotorStatus;

/**
 * Created by sanguk on 13/11/2017.
 */
public abstract class Motor {
    private MotorStatus motorStatus;
    private Door door;

    public Motor(){
        this.motorStatus = MotorStatus.STOPPED;
    }

    public void move() {
        if (this.motorStatus == MotorStatus.MOVING) {
            return;
        }
        if (this.door.getDoorStatus() == DoorStatus.OPEND) {
            door.close();
        }
        doMove();
        motorStatus = MotorStatus.MOVING;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    protected abstract void doMove();
}
