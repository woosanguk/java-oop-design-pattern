package template_method.exercise_01;

public class Customer {
    private String name;
    private int point;

    public Customer(String name, int point) {
        this.setName(name);
        this.setPoint(point);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return this.name;
    }

    public int getPoint() {
        return this.point;
    }
}
