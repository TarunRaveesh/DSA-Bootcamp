package Properties.Interfaces;

public class Car implements Engine, Brake, Media{
    int cost = 780000;
    @Override
    public void start() {
        System.out.println("Car Engine Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine Stopping");
    }

    @Override
    public void acc() {
        System.out.println("Car Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Brakes Used");
    }
}
