package decorator.exercise_02;

public class BasicCar extends CarComponent {
    private int price;

    public BasicCar(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getInfo() {
        return "Car";
    }
}
