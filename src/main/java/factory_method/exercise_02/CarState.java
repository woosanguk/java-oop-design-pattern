package factory_method.exercise_02;

public abstract class CarState {
    protected Car car;

    public CarState(Car car){
        this.car = car;
    }

    public void speedDown(int targetSpeed){
        System.out.print("Speed: " + car.getSpeed());
        if (targetSpeed < car.getSpeed()){
            car.setSpeed(targetSpeed);
        }
        System.out.println(" ==> " + car.getSpeed());
    }

    public abstract void speedUp(int targetSpeed);
    public abstract void engineFailedDetected();
    public abstract void engineRepaired();

}
