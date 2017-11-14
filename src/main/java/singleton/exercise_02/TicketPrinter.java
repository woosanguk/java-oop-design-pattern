package singleton.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class TicketPrinter {
    private static TicketPrinter instance;
    private static int ticketeNumber = 1;
    private TicketPrinter() {}
    public static TicketPrinter getInstance(){
        if (instance == null) {
            instance = new TicketPrinter();
        }
        return instance;
    }

    public int getTicketNumber() {
        return ticketeNumber++;
    }
}
