package singleton.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class UserThread extends Thread {
    public UserThread(String name) {
        super(name);
    }

    public void run() {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using "+ printer.toString() + ".");
    }
}
