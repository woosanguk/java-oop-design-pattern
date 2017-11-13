package template_method.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus () {
        return this.motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }
        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPEND) {
            door.close();
        }
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
