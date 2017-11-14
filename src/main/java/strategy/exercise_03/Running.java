package strategy.exercise_03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Running extends JFrame {
    private Field field;
    public Running() {
        super("Running");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        field = new Field();

        add(field, BorderLayout.CENTER);
        setSize(500, 500);
        setVisible(true);

        Thread th = new Thread(field);
        th.start();
    }
}
