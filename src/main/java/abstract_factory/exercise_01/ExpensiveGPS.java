package abstract_factory.exercise_01;

public class ExpensiveGPS extends GPS {
    public Location findCurrentLocation() {
        System.out.println("Find current location with Expensive GPS");
        return null;
    }
}
