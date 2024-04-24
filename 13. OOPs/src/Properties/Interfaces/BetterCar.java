package Properties.Interfaces;

public class BetterCar {
    private Engine engine;
    private final MediaPlayer player;

    public BetterCar(Engine engine, MediaPlayer player) {
        this.engine = engine;
        this.player = player;
    }
    // Engine Code
    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }

    // Music Player Code
    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }

    // Upgrade Engine;
    public boolean upgradeEngine(Engine engine) {
        this.engine = engine;
        return true;
    }
}
