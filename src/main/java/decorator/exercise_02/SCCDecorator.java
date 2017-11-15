package decorator.exercise_02;

public class SCCDecorator extends CarOptionDecorator {

    private int sccPrice;

    public SCCDecorator(CarComponent decoratedCar, int naviPrice) {
        super(decoratedCar);
        this.sccPrice = naviPrice;
    }

    public int getPrice() {
        int decoratedCarPrice = super.getPrice();
        int cssPrice = getSccPrice();
        return decoratedCarPrice + cssPrice;
    }

    public String getInfo() {
        return super.getInfo() + " with Smart Cruise Control";
    }

    public int getSccPrice() {
        return this.sccPrice;
    }
}
