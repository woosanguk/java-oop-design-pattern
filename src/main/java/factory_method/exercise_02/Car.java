package factory_method.exercise_02;

public class Car {
    private int speed;
    private CarState normalState;
    private CarState limpState;
    private CarState curState;

    public Car() {
        normalState = CarStateFactory.getState(CarStateID.NORMAL, this);
        limpState = CarStateFactory.getState(CarStateID.LIMP_MODE, this);
        curState = normalState;
        this.speed = 0;
    }

    public CarState getLimpState() {
        return limpState;
    }

    public CarState getNormalState() {
        return normalState;
    }

    public CarState getCurState() {
        return curState;
    }

    public void setCurState(CarState state){
        this.curState = state;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedDown(int targetSpeed){
        this.curState.speedDown(targetSpeed);
    }

    public void speedUp(int targetSpeed){
        this.curState.speedUp(targetSpeed);
    }

    public void engineFailedDetected() {
        this.curState.engineFailedDetected();
    }

    public void engineRepaired() {
        this.curState.engineRepaired();
    }

}
