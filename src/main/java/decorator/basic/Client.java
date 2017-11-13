package decorator.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        Display road = new RoadDisplay();

        road.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());

        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());

        roadWithTraffic.draw();

        Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();

        Display roadWithCrossingAndLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));

        roadWithCrossingAndLaneAndTraffic.draw();
    }
}
