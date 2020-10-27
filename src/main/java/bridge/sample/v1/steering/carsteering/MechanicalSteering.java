package bridge.sample.v1.steering.carsteering;

import bridge.sample.v1.steering.CarSteeringSystem;

// CONCERETE IMPLEMENTOR
public class MechanicalSteering implements CarSteeringSystem {

    @Override
    public void turnLeft() {
        System.out.println("Car :: ElectricPowerSteering :: Turn N degree to left with ARM MUSCLE :(");
    }

    @Override
    public void turnRight() {
        System.out.println("Car :: ElectricPowerSteering :: Turn N degree to right with ARM MUSCLE :(");
    }
}
