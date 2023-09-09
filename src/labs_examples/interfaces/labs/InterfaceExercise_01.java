package labs_examples.interfaces.labs;

/**
 * Interfaces Exercise 1:
 *
 *      1) Write an interface with at least three methods. Write two classes that implement the
 *          interface in different ways.
 *      2) Write a class that extends one of the classes from the previous step. Override the methods in
 *          the parent class.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle interface, that is advanced by a Tractor class and a Scooter class. Two of the methods could be
 *          turnOn() and brake().
 *       - A PersonalDevice interface that is implemented by an iPad class and a Computer class. Two of the methods could be
 *          playMusic() and turnOff().
 */
public class InterfaceExercise_01 {
    public static void main(String[] args) {
        Printer331 somePrinter = new Printer331();
        System.out.println(somePrinter.getName() + " is printing: " + somePrinter.isOn(true));
        somePrinter.turnOn();
        somePrinter.turnOff();
        System.out.println();

        // check that we can pass false to 001 and isPrinting is will be false
        Printer001 someOtherPrinter = new Printer001();
        someOtherPrinter.turnOn();
        someOtherPrinter.turnOff();
    }


    public interface printable {
        boolean isOn(boolean isOn);

        String getName();

        void turnOn();

        void turnOff();

    }
}


class Printer001 implements InterfaceExercise_01.printable {

    @Override
    public boolean isOn(boolean isOn) {
        return isOn;
    }

    @Override
    public String getName() {
        String name = "001";
        return name;
    }

    @Override
    public void turnOn() {
        System.out.println("Model " + getName() + "has been turned on with the 'Start' button. ");
        System.out.println(getName() + " is printing: " + isOn(true));
    }

    @Override
    public void turnOff() {
        System.out.println("Model " + getName() + "has been turned on with the 'Off' button. ");
        System.out.println(getName() + " is printing: " + isOn(false));
    }
}

class Printer301 implements InterfaceExercise_01.printable {

    @Override
    public boolean isOn(boolean isOn) {
        return true; // is always on
    }

    @Override
    public String getName() {
        String name = "301";
        return name;
    }

    @Override
    public void turnOn() {
        System.out.println("Model " + getName() + " has been activated by an item being sent for printing. ");
    }

    @Override
    public void turnOff() {
        System.out.println("Item printed. Model " + getName() + " is going to sleep. ");
    }
}


class Printer331 extends Printer301 {

    // Not an override but for variety: does not have its own isPrinting method but implements the parent one

    @Override
    public String getName() {
        String name = "331";
        return name;
    }

    @Override
    public void turnOn() {
        System.out.println("Model " + getName() + "has been activated by an item being sent for printing - and can " +
                "be turned off by holding the 'Off' button for 3 seconds . ");
    }

    @Override
    public void turnOff() {
        System.out.println("Item printed. Off button held for 3 seconds. Model " + getName() + " going to sleep");
        System.out.println(getName() + " is printing: " + super.isOn(false));
    }
}
