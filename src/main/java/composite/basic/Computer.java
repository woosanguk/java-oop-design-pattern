package composite.basic;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Computer extends ComputerDevice{

    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    public void removeCompoent(ComputerDevice component) {
        components.remove(component);
    }

    public int getPrice() {
        int price = 0;
        for (ComputerDevice component: components) {
            price += component.getPrice();
        }
        return price;
    }

    public int getPower() {
        int power = 0;
        for (ComputerDevice component: components) {
            power += component.getPower();
        }
        return power;
    }
}
