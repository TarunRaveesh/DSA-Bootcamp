package Properties.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car2 = new Car(); // Works, cz method overriding depends on the type of object.

        car.start();
        car.acc();
        car.stop();

        int price = car.cost;
        // int price = car2.cost; won't work as parent(i.e. engine doesn't know what the child class has)

        // Do not use interfaces in performance critical code,
        // due to overhead of dynamic method look up for overriding, since it happens at runtime.

        Media car3 = new Car();
        car3.start(); // Gives Engine output, so we need to create interface specific corresponding classes
    }
}
