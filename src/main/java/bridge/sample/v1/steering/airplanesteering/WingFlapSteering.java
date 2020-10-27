package bridge.sample.v1.steering.airplanesteering;

import bridge.sample.v1.steering.AirplaneSteeringSystem;

// CONCERETE IMPLEMENTOR
public class WingFlapSteering implements AirplaneSteeringSystem {

    @Override
    public void turnLeft() {
        System.out.println("Airplane :: WingFlapSteering :: Turn N degree to left");
    }

    @Override
    public void turnRight() {
        System.out.println("Airplane :: WingFlapSteering :: Turn N degree to right");
    }

    @Override
    public void goUp() {
        System.out.println("Airplane :: WingFlapSteering :: Turn N degree to up");
    }

    @Override
    public void goDown() {
        System.out.println("Airplane :: WingFlapSteering :: Turn N degree to downs");
    }
}
