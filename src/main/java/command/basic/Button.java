package command.basic;

/**
 * Created by sanguk on 10/11/2017.
 */

public class Button {
    private Command comand;

    Button(Command comand){
        this.comand = comand;
    }
    public void setCommand (Command comand){
        this.comand = comand;
    }
    public void pressed(){
        this.comand.execute();
    }
}
