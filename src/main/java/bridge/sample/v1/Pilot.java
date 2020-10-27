package bridge.sample.v1;

import bridge.sample.v1.steering.AirplanSteeringWheel;
import bridge.sample.v1.steering.CanFlyAirplane;

public class Pilot implements CanFlyAirplane {

    private AirplanSteeringWheel steeringWheel;

    @Override
    public void handleWheel(AirplanSteeringWheel steeringWheel) {

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

    @Override
    public void pull() {
        steeringWheel.goUp();
    }

    @Override
    public void push() {
        steeringWheel.goDown();
    }

    public void getIn(Airplane airplane) {
        airplane.setPilot(this);
    }
}
