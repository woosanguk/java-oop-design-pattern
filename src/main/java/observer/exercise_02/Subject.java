package observer.exercise_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanguk on 14/11/2017.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver (){
        for (Observer observer: observers){
            observer.update();
        }
    }
}
