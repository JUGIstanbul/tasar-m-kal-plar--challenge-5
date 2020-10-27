package bridge.sample.v1.steering;

import bridge.sample.v1.SteeringSystem;

// IMPLEMENTOR
public interface AirplaneSteeringSystem extends SteeringSystem {

    void goUp();

    void goDown();
}
