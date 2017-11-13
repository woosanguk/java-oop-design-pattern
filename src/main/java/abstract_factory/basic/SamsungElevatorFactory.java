package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class SamsungElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private SamsungElevatorFactory() {}
    public static ElevatorFactory getInstance() {
        if (factory == null){
            factory = new SamsungElevatorFactory();
        }
        return factory;
    }
    public Motor createMotor() {
        return new SamsungMotor();
    }

    public Door createDoor() {
        return new SamsungDoor();
    }
}
