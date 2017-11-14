package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public static void main (String args[]) {
        VendingMachine machine = new VendingMachine(5, 1000);
        machine.pushButton();
        machine.returnButton();
        machine.insertMoney(500);
        machine.pushButton();
        machine.insertMoney(500);
        machine.pushButton();
        machine.pushButton();
        machine.insertMoney(1000);
        machine.insertMoney(1000);
        machine.pushButton();
        machine.pushButton();
        machine.pushButton();
        machine.insertMoney(4000);
        machine.pushButton();
        machine.returnButton();
        machine.insertMoney(6000);
        machine.pushButton();
        machine.pushButton();
        machine.insertMoney(6000);
        machine.returnButton();
        machine.returnButton();
    }
}
