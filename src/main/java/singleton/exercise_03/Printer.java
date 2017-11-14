package singleton.exercise_03;

import java.util.Random;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Printer {
    private boolean available = true;
    private String name;
    public boolean isAvailable(){
        return this.available;
    }
    public Printer(String name) {
        this.name = name;
    }
    public void print(String name){
        try{
            Thread.sleep(new Random().nextInt(100));
            if (!this.available){
                System.out.println(this.name + "-->" + name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setAvailable(true);
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
