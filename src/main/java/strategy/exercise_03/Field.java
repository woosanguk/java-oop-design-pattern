package strategy.exercise_03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Field extends JPanel implements Runnable {
    private JLabel lbl;
    private String[] walkingImage = {"/walk1.png", "/walk2.png"};

    public Field() {
        setLayout(new BorderLayout());
        lbl = new JLabel();
        lbl.setIcon(new ImageIcon(this.getClass().getResource("/walk2.png")));
        add(lbl, BorderLayout.CENTER);
    }
    public void run() {
        while(true){
            String[] path = walkingImage;
            for (int i = 0; i < path.length; i++){
                lbl.setIcon(new ImageIcon(this.getClass().getResource(path[i])));
            }
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
    }

}
