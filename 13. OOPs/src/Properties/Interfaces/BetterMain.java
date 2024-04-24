package Properties.Interfaces;

public class BetterMain {
    public static void main(String[] args) {
        PowerEngine engine = new PowerEngine();
        MediaPlayer player = new MediaPlayer();
        BetterCar car = new BetterCar(engine, player);

        car.start();
        car.stop();

        car.startMusic();
        car.stopMusic();

        ElectricEngine upgrade = new ElectricEngine();
        if(car.upgradeEngine(upgrade)) {
            System.out.println("Engine Upgraded!");
        }
        car.start();
        car.stop();

    }
}
