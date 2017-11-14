package command.exercise_02;

import java.util.ArrayList;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorManager {
    private ArrayList<ElevatorController> controllers;
    public ElevatorManager(int controllerCount){
        this.controllers = new ArrayList<ElevatorController>(controllerCount);
    }

    public void addController(ElevatorController controller){
        this.controllers.add(controller);
    }

    public void requestElevator(int destination, ElevatorDirection direction) {
        int selectedElevator = this.selectElevator(destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }

    private int selectElevator(int destination, ElevatorDirection direction) {
        return 0;
    }
}
