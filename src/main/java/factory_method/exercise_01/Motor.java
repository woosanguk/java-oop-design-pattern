package factory_method.exercise_01;

public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor(){
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus(){
        return this.motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);

    public void stop(){
        motorStatus = MotorStatus.STOPPED;
    }
}
