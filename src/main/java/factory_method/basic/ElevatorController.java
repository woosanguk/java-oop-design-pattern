package factory_method.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.print("Elevator [" + this.id + "] Floor: " + curFloor);
        curFloor = destination;
        System.out.println(" ===> " + destination);
    }
}
