package Enums;

public class Basic {
    enum Week implements Hello{ // Automatically Extends java.lang.Enum class, hence can't extend
        // anything else as java doesn't support multiple inheritance. Can implement interfaces tho.
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
        // All enum constants are public static final
        // Can't create child Enums (since final)

        // Can't have abstract methods, since can't do overriding, since enums can't be inherited, since final
        // void display();

        //can have normal methods and can override interface methods

        // Constructor not public/protected, only default or private
        Week() { // Can't create enum objects in main function explicitly, hence constructor
            // is invoked for all enum constants.
            System.out.println("Constructor for " + this);
        }

        @Override
        public void greet() {
            System.out.println("Hello There!");
        }
    }

    public static void main(String[] args) {
        for(Week day : Week.values()) {
            System.out.println((day.ordinal() + 1) + " " + day);
        }

        Week week;
        week = Week.Monday;
        week.greet();
        System.out.println(Week.valueOf("Tuesday")); // returns Enum Constant
        // i.e. Internally: public static final Week Monday = new Week();
    }
}
