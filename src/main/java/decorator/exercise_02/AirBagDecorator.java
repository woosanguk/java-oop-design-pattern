package decorator.exercise_02;

public class AirBagDecorator extends CarOptionDecorator {

    private int airBagPrice;

    public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
        super(decoratedCar);
        this.airBagPrice = airBagPrice;
    }

    public int getPrice() {
        int decoratedCarPrice = super.getPrice();
        int airBagPrice = getAirBagPrice();
        return decoratedCarPrice + airBagPrice;
    }

    public String getInfo() {
        return super.getInfo() + " with Air Bag";
    }

    public int getAirBagPrice() {
        return this.airBagPrice;
    }
}
