package factory_method.exercise_01;

public class LGMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }
}
