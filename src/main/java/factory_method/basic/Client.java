package factory_method.basic;

import template_method.basic.Direction;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyId.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyId.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyId.DYNAMIC);
        emWithDynamicScheduler.requestElevator(2, Direction.UP);
    }
}
