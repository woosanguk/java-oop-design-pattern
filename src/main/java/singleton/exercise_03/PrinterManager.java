package singleton.exercise_03;

import java.util.ArrayList;

/**
 * Created by sanguk on 14/11/2017.
 */
public class PrinterManager {
    private static PrinterManager instance;
    private ArrayList<Printer> printers = new ArrayList<Printer>();
    private PrinterManager() {
        printers.add(new Printer("print1"));
        printers.add(new Printer("print2"));
        printers.add(new Printer("print3"));
    }
    public synchronized static PrinterManager getPrinterManger() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }
    public Printer getPrinter(){
        while(true) {
            for (Printer printer:printers){
                if (printer.isAvailable()){
                    printer.setAvailable(false);
                    return printer;
                }
            }
        }
    }
}
