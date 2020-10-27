package bridge.sample.v1;

import bridge.sample.v1.steering.CarSteeringWheel;

public class Car {

    private CarSteeringWheel steeringWheel;

    public Car(CarSteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public void setDriver(Driver driver) {
        driver.handleWheel(steeringWheel);
    }
}
