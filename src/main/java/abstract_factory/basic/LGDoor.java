package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class LGDoor extends Door {
    protected void doClose() {
        System.out.println("Close LG Door");
    }

    protected void doOpen() {
        System.out.println("Open LG Door");
    }
}
