package abstract_factory.exercise_01;

public abstract class NaviFactory {
    public abstract GPS createGPS();
    public abstract Screen createScreen();
    public abstract Map createMap();
    public abstract PathFinder createPathFinder();
}
