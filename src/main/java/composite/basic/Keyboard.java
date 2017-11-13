package composite.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Keyboard  extends ComputerDevice{
    private int price;
    private int power;

    public Keyboard (int power, int price) {
        this.power = power;
        this.price = price;
    }

    public int getPrice (){
        return this.price;
    }

    public int getPower () {
        return this.power;
    }
}
