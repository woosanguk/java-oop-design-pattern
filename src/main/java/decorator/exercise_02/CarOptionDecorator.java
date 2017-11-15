package decorator.exercise_02;

public abstract class CarOptionDecorator extends CarComponent{
    private CarComponent decoratedCar;

    public CarOptionDecorator(CarComponent decoratedCar){
        this.decoratedCar = decoratedCar;
    }

    public int getPrice() {
        return this.decoratedCar.getPrice();
    }

    public String getInfo() {
        return this.decoratedCar.getInfo();
    }
}
