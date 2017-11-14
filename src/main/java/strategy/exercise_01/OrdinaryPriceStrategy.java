package strategy.exercise_01;

/**
 * Created by sanguk on 10/11/2017.
 */
public class OrdinaryPriceStrategy implements PriceStrategy {
    public int calcPrice(int price, int numberOfBook) {
        return price * numberOfBook;
    }
}
