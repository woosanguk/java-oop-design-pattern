package abstract_factory.exercise_01;

public class SlowPathFinder extends PathFinder {
    public Path findPath(Location from, Location to) {
        System.out.println("Slow Path Finder");
        return null;
    }
}
