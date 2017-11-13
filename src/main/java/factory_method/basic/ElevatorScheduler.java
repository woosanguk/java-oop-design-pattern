package factory_method.basic;

import template_method.basic.Direction;

/**
 * Created by sanguk on 13/11/2017.
 */
public interface ElevatorScheduler {
    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
