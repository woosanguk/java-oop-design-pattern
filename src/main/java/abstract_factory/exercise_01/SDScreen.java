package abstract_factory.exercise_01;

public class SDScreen extends Screen {
    public void drawMap(Map map){
        System.out.println("Draw map " + map.getClass().getName() + " on SD screen");
    }
}
