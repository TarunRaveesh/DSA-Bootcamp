package Properties.Interfaces;

public class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Start Electric Engine");
    }
    public void stop() {
        System.out.println("Stop Electric Engine");
    }
    public void acc() {
        System.out.println("Accelerate Electric Engine");
    }
}
