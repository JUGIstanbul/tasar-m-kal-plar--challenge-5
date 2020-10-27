package bridge.sample.v1.steering.airplanesteering;

import bridge.sample.v1.steering.AirplaneSteeringSystem;

/**
 *  Ref: https://www.flight-mechanic.com/nose-wheel-steering-systems/#:~:text=The%20nose%20wheel%20on%20most,during%20taxi%20by%20differential%20braking.
 */
// CONCERETE IMPLEMENTOR
public class WheelSteering implements AirplaneSteeringSystem {

    @Override
    public void turnLeft() {
        System.out.println("Airplane :: WheelSteeringSystem :: Turn N degree to left on the land");
    }

    @Override
    public void turnRight() {
        System.out.println("Airplane :: WheelSteeringSystem :: Turn N degree to right on the land");
    }

    @Override
    public void goUp() {
        System.out.println("Airplane :: WheelSteeringSystem :: I can't help you to fly!!!");
    }

    @Override
    public void goDown() {
        System.out.println("Airplane :: WheelSteeringSystem :: I can't help you to fly!!!");
    }
}
