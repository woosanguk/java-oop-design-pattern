package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class HyundaiDoor extends Door {
    protected void doClose() {
        System.out.println("Close Hyundai Door");
    }

    protected void doOpen() {
        System.out.println("Open Hyundai Door");
    }
}
