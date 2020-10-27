package bridge.sample.v1.steering;

public interface CanFlyAirplane {

    void handleWheel(AirplanSteeringWheel steeringWheel);

    void turnLeft();

    void turnRight();

    void pull();

    void push();
}
