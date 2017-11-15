package decorator.exercise_02;

public class ESCDecorator extends CarOptionDecorator {
    private int escPrice;

    public ESCDecorator(CarComponent decoratedCar, int escPrice) {
        super(decoratedCar);
        this.escPrice = escPrice;
    }

    public int getPrice() {
        int decoratedCarPrice = super.getPrice();
        int escPrice = getEscPrice();
        return decoratedCarPrice + escPrice;
    }

    public String getInfo() {
        return super.getInfo() + " with Electronic Stability Control";
    }

    public int getEscPrice() {
        return this.escPrice;
    }
}
