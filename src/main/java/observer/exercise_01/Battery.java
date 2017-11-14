package observer.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Battery extends Subject{
    private int level = 100;

    public int getLevel(){
        return this.level;
    }

    public void consume(int amount) {
        this.level -= amount;
        this.notifyObservers();
    }
}
