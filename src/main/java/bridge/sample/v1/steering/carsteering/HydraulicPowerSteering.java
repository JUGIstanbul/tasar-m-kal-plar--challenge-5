package bridge.sample.v1.steering.carsteering;

import bridge.sample.v1.steering.CarSteeringSystem;

// CONCERETE IMPLEMENTOR
public class HydraulicPowerSteering implements CarSteeringSystem {

    @Override
    public void turnLeft() {
        System.out.println("Car :: HydraulicPowerSteering :: Turn N degree to left with assist of ENGINE-DRIVEN PUMP :)");
    }

    @Override
    public void turnRight() {
        System.out.println("Car :: HydraulicPowerSteering :: Turn N degree to right with assist of ENGINE-DRIVEN PUMP :)");
    }
}
