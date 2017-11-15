package abstract_factory.exercise_01;

public class BasicNaviFactory extends NaviFactory {
    private static NaviFactory factory;
    private BasicNaviFactory() {}

    public static NaviFactory getInstance(){
        if (factory == null) {
            factory = new BasicNaviFactory();
        }
        return factory;
    }
    public GPS createGPS() {
        return new CheapGPS();
    }

    public Screen createScreen() {
        return new SDScreen();
    }

    public Map createMap() {
        return new SmallMap();
    }

    public PathFinder createPathFinder() {
        return new SlowPathFinder();
    }
}
