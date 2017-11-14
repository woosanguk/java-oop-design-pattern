package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class SoldOutState implements State {
    private VendingMachine machine;
    public SoldOutState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin(int money) {
        System.out.println("sold out");
    }

    public void pushButton() {
        System.out.println("sold out");
    }

    public void returnCoin() {
        this.machine.getMoneyBox().returnMoney();
        machine.setState(machine.getNoMoneyState());
    }
}
