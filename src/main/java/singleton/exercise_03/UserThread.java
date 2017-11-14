package singleton.exercise_03;

/**
 * Created by sanguk on 14/11/2017.
 */
public class UserThread extends Thread {
    private Printer myPrinter;

    public UserThread(String name) {
        super(name);
    }

    public void run() {
        PrinterManager mgr = PrinterManager.getPrinterManger();
        myPrinter = mgr.getPrinter();
        myPrinter.print(getName());
    }
}
