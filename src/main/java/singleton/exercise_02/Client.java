package singleton.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        TicketPrinter ticketPrinter = TicketPrinter.getInstance();

        System.out.println(ticketPrinter.getTicketNumber());
        System.out.println(ticketPrinter.getTicketNumber());
        System.out.println(ticketPrinter.getTicketNumber());
        System.out.println(ticketPrinter.getTicketNumber());
    }
}
