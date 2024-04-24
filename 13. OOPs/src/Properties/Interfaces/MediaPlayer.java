package Properties.Interfaces;

public class MediaPlayer implements Media{
    public void start() {
        System.out.println("Play Music");
    }
    public void stop() {
        System.out.println("Pause Music");
    }
}
