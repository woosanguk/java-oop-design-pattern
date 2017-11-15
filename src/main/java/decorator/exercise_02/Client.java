package decorator.exercise_02;

public class Client {
    public static void main(String args[]){
        CarComponent car = new BasicCar(1000);
        System.out.println(car.getPrice());
        System.out.println(car.getInfo());
        car = new AirBagDecorator(car, 100);
        System.out.println(car.getPrice());
        System.out.println(car.getInfo());
        car = new ESCDecorator(car, 50);
        System.out.println(car.getPrice());
        System.out.println(car.getInfo());
        car = new NaviDecorator(car, 30);
        System.out.println(car.getPrice());
        System.out.println(car.getInfo());
        car = new SCCDecorator(car, 70);
        System.out.println(car.getPrice());
        System.out.println(car.getInfo());
    }
}
