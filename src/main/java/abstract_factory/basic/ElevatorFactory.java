package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
