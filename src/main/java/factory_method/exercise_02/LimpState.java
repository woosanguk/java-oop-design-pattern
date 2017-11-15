package factory_method.exercise_02;

public class LimpState extends CarState {
    private static CarState state;
    public static final int LIMP_MODE_MAX_SPEED = 60;

    private LimpState(Car car) {
        super(car);
    }

    public static CarState getInstance(Car car) {
        if (state == null) {
            state = new LimpState(car);
        }
        return state;
    }

    public void speedUp(int targetSpeed) {
        System.out.print("Speed: " + car.getSpeed());
        if (targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED){
            car.setSpeed(targetSpeed);
        }
        System.out.println(" ==> " + car.getSpeed());
    }

    public void engineFailedDetected() {

    }

    public void engineRepaired() {
        car.setCurState(car.getNormalState());
    }
}
