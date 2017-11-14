package singleton.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Singleton {
    private static Singleton instance= null;
    private Singleton() {}
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void doSomething() {

    }
}
