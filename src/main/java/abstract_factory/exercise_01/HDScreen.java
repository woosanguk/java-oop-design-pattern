package abstract_factory.exercise_01;

public class HDScreen extends Screen {
    public void drawMap(Map map){
        System.out.println("Draw map " + map.getClass().getName() + " on HD screen");
    }
}
