package bridge.sample.v1;

import bridge.sample.v1.Car;
import bridge.sample.v1.steering.CanDriveCar;
import bridge.sample.v1.steering.CarSteeringWheel;

public class Driver implements CanDriveCar {

    private CarSteeringWheel steeringWheel;

    @Override
    public void handleWheel(CarSteeringWheel steeringWheel) {

        this.steeringWheel = steeringWheel;
    }

    @Override
    public void turnLeft() {
        steeringWheel.turnLeft();
    }

    @Override
    public void turnRight() {
        steeringWheel.turnRight();
    }

    public void getIn(Car car) {
        car.setDriver(this);
    }
}
