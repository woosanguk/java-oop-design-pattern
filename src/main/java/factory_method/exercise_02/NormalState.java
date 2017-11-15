package factory_method.exercise_02;

public class NormalState extends CarState {
    private static CarState state;

    private NormalState(Car car) {
        super(car);
    }

    public static CarState getInstance(Car car) {
        if (state == null) {
            state = new NormalState(car);
        }
        return state;
    }

    public void speedUp(int targetSpeed) {
        System.out.print("Speed: " + car.getSpeed());
        if (targetSpeed > car.getSpeed()){
            car.setSpeed(targetSpeed);
        }
        System.out.println(" ==> " + car.getSpeed());
    }

    public void engineFailedDetected() {
        System.out.print("Speed: " + car.getSpeed());
        car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED);
        System.out.println(" ==> " + car.getSpeed());
        car.setCurState(car.getLimpState());
    }

    public void engineRepaired() {
        System.out.print("Unexpected Event");
    }
}
