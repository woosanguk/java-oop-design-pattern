package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class LGElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;
    private LGElevatorFactory() {}
    public static ElevatorFactory getInstance() {
        if (factory == null){
            factory = new LGElevatorFactory();
        }
        return factory;
    }
    public Motor createMotor() {
        return new LGMotor();
    }

    public Door createDoor() {
        return new LGDoor();
    }
}
