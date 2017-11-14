package command.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        TwoButtonController twoButtonController = new TwoButtonController();
        TV tv = new TV();
        PowerCommand powerCommand = new PowerCommand(tv);
        MuteCommand muteCommand = new MuteCommand(tv);
        twoButtonController.setCommand(powerCommand, muteCommand);

        twoButtonController.button1Pressed();
        twoButtonController.button1Pressed();
        twoButtonController.button2Pressed();
        twoButtonController.button2Pressed();

    }
}
