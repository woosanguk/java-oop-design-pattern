package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class EnoughMoneyState implements State {
    private VendingMachine machine;
    public EnoughMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    public void insertCoin(int money) {
        machine.getMoneyBox().insert(money);
    }

    public void pushButton() {
        machine.getMoneyBox().dispense(machine.getDrinking().getPrice());
        machine.getDrinking().dispense();
        if (machine.getDrinking().getStock() == 0){
            machine.setState(machine.getSoldOutState());
        } else if (machine.getMoneyBox().getMoney() < machine.getDrinking().getPrice()){
            machine.setState(machine.getNoEnoughMoneyState());
        } else if (machine.getMoneyBox().getMoney() == 0) {
            machine.setState(machine.getNoMoneyState());
        }
    }

    public void returnCoin() {
        this.machine.getMoneyBox().returnMoney();
        machine.setState(machine.getNoMoneyState());
    }
}
