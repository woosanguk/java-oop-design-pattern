package abstract_factory.exercise_01;

public class CheapGPS extends GPS {
    public Location findCurrentLocation() {
        System.out.println("Find current location with Cheap GPS");
        return null;
    }
}
