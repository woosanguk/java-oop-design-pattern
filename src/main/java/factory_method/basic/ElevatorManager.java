package factory_method.basic;

import template_method.basic.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by sanguk on 13/11/2017.
 */
public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyId strategyId;

    public ElevatorManager(int controllerCount, SchedulingStrategyId strategyId) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        this.strategyId = strategyId;
    }

    public void setStrategyId(SchedulingStrategyId strategyId) {
        this.strategyId = strategyId;
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyId);
        System.out.println(scheduler);
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }

}
