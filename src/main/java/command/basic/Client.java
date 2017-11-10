package command.basic;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Client {
    static public void main(String args[]){
        Button button = new Button(new LampOnCommand(new Lamp()));
        button.pressed();

        button.setCommand(new LampOffCommand(new Lamp()));
        button.pressed();

        button.setCommand(new AlarmOnCommand(new Alarm()));
        button.pressed();
    }
}
