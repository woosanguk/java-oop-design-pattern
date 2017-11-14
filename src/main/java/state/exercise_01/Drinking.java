package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Drinking {
    private int stock;
    private int price;

    public Drinking(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public int getStock() {
        return this.stock;
    }

    public int getPrice() {
        return this.price;
    }

    public void dispense() {
        System.out.println("drink dispense");
        this.stock--;
    }
}
