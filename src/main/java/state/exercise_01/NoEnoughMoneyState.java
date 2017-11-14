package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class NoEnoughMoneyState implements State {
    private VendingMachine machine;
    public NoEnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
        if (machine.getMoneyBox().getMoney() >= machine.getDrinking().getPrice()) {
            machine.setState(machine.getEnoughMoneyState());
        }
    }

    public void pushButton() {
        System.out.println("Please insert more money!!");
    }

    public void returnCoin() {
        this.machine.getMoneyBox().returnMoney();
        machine.setState(machine.getNoMoneyState());
    }
}
