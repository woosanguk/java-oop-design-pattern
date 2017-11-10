package strategy.exercise;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Member {
    private String name;
    private int totalRentalPrice;

    Member(String name) {
        this.name = name;
        this.totalRentalPrice = 0;
    }

    String getName(){
        return this.name;
    }

    int getTotalRentalPrice(){
        return this.totalRentalPrice;
    }

    void addRentalPrice(int price) {
        this.totalRentalPrice += price;
    }
}
