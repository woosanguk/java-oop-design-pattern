package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class VendingMachine {
    private State noMoneyState;
    private State noEnoughMoneyState;
    private State enoughMoneyState;
    private State soldOutState;
    private State state;

    private MoneyBox moneyBox;
    private Drinking drinking;

    public VendingMachine(int stock, int price) {
        this.noMoneyState = new NoMoneyState(this);
        this.noEnoughMoneyState = new NoEnoughMoneyState(this);
        this.enoughMoneyState = new EnoughMoneyState(this);
        this.soldOutState = new SoldOutState(this);

        this.moneyBox = new MoneyBox();
        this.drinking = new Drinking(stock, price);

        if (drinking.getStock() > 0) {
            state = noMoneyState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public void insertMoney(int money) {
        state.insertCoin(money);
    }

    public void pushButton() {
        state.pushButton();
    }

    public void returnButton() {
        state.returnCoin();
    }

    public MoneyBox getMoneyBox(){
        return this.moneyBox;
    }

    public Drinking getDrinking(){
        return this.drinking;
    }

    public State getNoMoneyState(){
        return this.noMoneyState;
    }

    public State getEnoughMoneyState(){
        return this.enoughMoneyState;
    }

    public State getSoldOutState(){
        return this.soldOutState;
    }

    public State getNoEnoughMoneyState(){
        return this.noEnoughMoneyState;
    }

}
