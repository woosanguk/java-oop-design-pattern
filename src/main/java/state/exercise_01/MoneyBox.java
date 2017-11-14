package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class MoneyBox {
    private int money;

    public MoneyBox() {
        this.money = 0;
    }

    public int getMoney() {
        return this.money;
    }

    public void insert(int money) {
        System.out.println("insert money = " + money);
        this.money += money;
        System.out.println("current total money = " + this.money);
    }

    public void dispense(int price) {
        this.money -= price;
    }

    public int returnMoney(){
        int ret = this.money;
        System.out.println("return money = " + ret);
        this.money = 0;
        return ret;
    }
}
