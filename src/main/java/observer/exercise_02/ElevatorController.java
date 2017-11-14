package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ElevatorController extends Subject {
    private int curFloor;

    public ElevatorController(int curFloor){
        this.curFloor = curFloor;
    }

    public int getCurFloor(){
        return this.curFloor;
    }

    public void gotoFloor(int destination){
        this.curFloor = destination;
        notifyObserver();
    }
}
