package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class HyundaiElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private HyundaiElevatorFactory() {}
    public static ElevatorFactory getInstance() {
        if (factory == null){
            factory = new HyundaiElevatorFactory();
        }
        return factory;
    }
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    public Door createDoor() {
        return new HyundaiDoor();
    }
}
