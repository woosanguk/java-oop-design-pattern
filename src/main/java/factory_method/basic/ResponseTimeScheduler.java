package factory_method.basic;

import template_method.basic.Direction;

/**
 * Created by sanguk on 13/11/2017.
 */
public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;
    private ResponseTimeScheduler() {}
    public static ElevatorScheduler getInstance() {
        if (scheduler == null) {
            scheduler = new ResponseTimeScheduler();
        }
        return scheduler;
    }
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 1;
    }
}
