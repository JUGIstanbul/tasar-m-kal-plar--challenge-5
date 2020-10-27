package bridge.sample.v1.steering;

import bridge.sample.v1.SteeringWheel;

// REFINED ABSTRACTION
public class CarSteeringWheel implements SteeringWheel {

    private CarSteeringSystem system;

    public CarSteeringWheel(CarSteeringSystem system){
        this.system = system;
    }

    @Override
    public void turnLeft() {
        system.turnLeft();
    }

    @Override
    public void turnRight() {
        system.turnRight();
    }

    @Override
    public void goUp() {
        System.out.println("CarSteeringWheel :: Not Support goUp steering");
    }

    @Override
    public void goDown() {
        System.out.println("CarSteeringWheel :: Not Support goDown steering");
    }
}
