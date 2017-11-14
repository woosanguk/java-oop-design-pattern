package command.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorController {
    private int id;
    private int curFloor;
    public ElevatorController(int id){
        this.id = id;
        this.curFloor = 1;
    }

    public void gotoFloor(int destination) {
        this.curFloor = destination;
        System.out.println(this.id + ":goto->" + destination);
    }
}
