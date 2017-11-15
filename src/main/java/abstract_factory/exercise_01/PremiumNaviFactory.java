package abstract_factory.exercise_01;

public class PremiumNaviFactory extends NaviFactory {
    private static NaviFactory factory;
    private PremiumNaviFactory() {}

    public static NaviFactory getInstance(){
        if (factory == null) {
            factory = new PremiumNaviFactory();
        }
        return factory;
    }

    public GPS createGPS() {
        return new ExpensiveGPS();
    }

    public Screen createScreen() {
        return new HDScreen();
    }

    public Map createMap() {
        return new LargeMap();
    }

    public PathFinder createPathFinder() {
        return new FastPathFinder();
    }
}
