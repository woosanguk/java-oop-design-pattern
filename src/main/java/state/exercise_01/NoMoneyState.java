package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class NoMoneyState implements State {
    private VendingMachine machine;
    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        if (money >= machine.getDrinking().getPrice()) {
            machine.setState(machine.getEnoughMoneyState());
        } else {
            machine.setState(machine.getNoEnoughMoneyState());
        }
    }

    public void pushButton() {
        System.out.println("Please insert money!!");
    }

    public void returnCoin() {
        System.out.println("You don't have money..");
    }
}
