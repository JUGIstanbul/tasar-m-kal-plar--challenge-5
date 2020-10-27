package bridge.sample.v1.steering;

import bridge.sample.v1.Airplane;
import bridge.sample.v1.SteeringWheel;
import bridge.sample.v1.steering.airplanesteering.WheelSteering;
import bridge.sample.v1.steering.airplanesteering.WingFlapSteering;

// REFINED ABSTRACTION
public class AirplanSteeringWheel implements SteeringWheel {

    private static final int MIN_SPEED_TO_TAKEOFF = 50;

    private Airplane airplane;
    private WheelSteering wheelSteering;
    private WingFlapSteering wingFlapSteering;

    public AirplanSteeringWheel(WingFlapSteering wingFlapSteering, WheelSteering wheelSteering) {
        this.wingFlapSteering = wingFlapSteering;
        this.wheelSteering = wheelSteering;
    }

    public void attach(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void turnLeft() {
        if (airplane.isFlying()) {
            wingFlapSteering.turnLeft();
        } else {
            wheelSteering.turnLeft();
        }
    }

    @Override
    public void turnRight() {
        if (airplane.isFlying()) {
            wingFlapSteering.turnRight();
        } else {
            wheelSteering.turnRight();
        }
    }

    @Override
    public void goUp() {
        if (airplane.isFlying()) {
            wingFlapSteering.goUp();
        } else {
            if (airplane.getSpeed() > MIN_SPEED_TO_TAKEOFF) {
                wheelSteering.goUp();
                airplane.setFlying(true);
                System.out.println("Airplane has been started to fly!");
            } else {
                System.out.println("Speed is not enough to take off!");
            }
        }
    }

    @Override
    public void goDown() {
        if (airplane.isFlying()) {
            if (airplane.getLatitude() <= 10) {
                airplane.setFlying(false);
                System.out.println("Airplane has been landed!");
            } else {
                wingFlapSteering.goDown();
            }
        }
    }

}
