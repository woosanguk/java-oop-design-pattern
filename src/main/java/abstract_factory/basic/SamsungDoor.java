package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class SamsungDoor extends Door {
    protected void doClose() {
        System.out.println("Close Samsung Door");
    }

    protected void doOpen() {
        System.out.println("Open Samsung Door");
    }
}
