package template_method.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);
    }
}
