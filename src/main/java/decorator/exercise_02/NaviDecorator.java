package decorator.exercise_02;

public class NaviDecorator extends CarOptionDecorator {

    private int naviPrice;

    public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
        super(decoratedCar);
        this.naviPrice = naviPrice;
    }

    public int getPrice() {
        int decoratedCarPrice = super.getPrice();
        int airBagPrice = getNaviPrice();
        return decoratedCarPrice + airBagPrice;
    }

    public String getInfo() {
        return super.getInfo() + " with Navigation";
    }

    public int getNaviPrice() {
        return this.naviPrice;
    }
}
