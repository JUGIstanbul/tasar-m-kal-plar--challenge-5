package bridge.sample.v1.steering;

public interface CanDriveCar {

    void handleWheel(CarSteeringWheel steeringWheel);

    void turnLeft();

    void turnRight();
}
