package bridge.sample.v1;

import bridge.sample.v1.steering.AirplanSteeringWheel;

public class Airplane {

    private AirplanSteeringWheel steeringWheel;
    private boolean flying;
    private int latitude;
    private int speed;
    private Pilot pilot;

    public Airplane(AirplanSteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
        steeringWheel.attach(this);
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public int getLatitude() {
        return latitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public int getSpeed() {
        return speed;
    }

    public void incSpeed(int diff) {
        speed += diff;
    }

    public void setPilot(Pilot pilot) {
        pilot.handleWheel(steeringWheel);
    }

    public void incLatitude(int diff) {
        latitude += diff;
    }
}
