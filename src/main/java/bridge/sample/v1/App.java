package bridge.sample.v1;

import bridge.sample.v1.steering.AirplanSteeringWheel;
import bridge.sample.v1.steering.CarSteeringWheel;
import bridge.sample.v1.steering.airplanesteering.WheelSteering;
import bridge.sample.v1.steering.airplanesteering.WingFlapSteering;
import bridge.sample.v1.steering.carsteering.ElectricPowerSteering;
import bridge.sample.v1.steering.carsteering.MechanicalSteering;

public class App {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Car car = new Car(new CarSteeringWheel(new MechanicalSteering()));
        driver.getIn(car);
        driver.turnLeft();
        driver.turnRight();

        Pilot pilot = new Pilot();
        Airplane airplane = new Airplane(new AirplanSteeringWheel(new WingFlapSteering(), new WheelSteering()));
        pilot.getIn(airplane);
        airplane.incSpeed(60);
        pilot.pull();
        airplane.incLatitude(100);
        pilot.turnLeft();
        pilot.push();
        airplane.incLatitude(-40);
        pilot.push();
        airplane.incLatitude(-60);
        pilot.push();
        pilot.turnLeft();
        pilot.turnRight();
    }
}
