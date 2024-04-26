package Cloning;

public class Main {
    public static void main(String[] args) {
        Person Tarun = new Person(21, "Tarun");
        Person Twin = new Person(Tarun);

        Person newTwin = Tarun.clone();

        System.out.println();
    }
}
