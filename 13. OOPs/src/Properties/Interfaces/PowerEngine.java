package Properties.Interfaces;

public class PowerEngine implements Engine{
    public void start() {
        System.out.println("Start Power Engine");
    }
    public void stop() {
        System.out.println("Stop Power Engine");
    }
    public void acc() {
        System.out.println("Accelerate Power Engine");
    }
}
