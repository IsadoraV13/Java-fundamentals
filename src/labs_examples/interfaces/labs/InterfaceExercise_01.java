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
        Printer001 printerA = new Printer001();
        printerA.turnOn();
        printerA.turnOff();
        System.out.println();

        Printer301 printerB = new Printer301();
        printerB.turnOn();
        printerB.turnOff();
        System.out.println();

        Printer331 printerC = new Printer331();
        printerC.turnOn();
        printerC.turnOff();

    }


    public interface printable {
        boolean isOn(boolean isOn);

        boolean isOn();

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
    public boolean isOn() {
        return true;
    }


    @Override
    public void turnOn() {
        System.out.println(this.getClass().getSimpleName() + " has been turned on with the 'Start' button. ");
        System.out.println(this.getClass().getSimpleName() + " is On: " + isOn());
    }

    @Override
    public void turnOff() {
        System.out.println(this.getClass().getSimpleName()  + " has been turned on with the 'Off' button. ");
        System.out.println(this.getClass().getSimpleName()  + " is On: " + isOn(false));
    }
}

class Printer301 implements InterfaceExercise_01.printable {

    @Override
    public boolean isOn(boolean isOn) {
        return isOn;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void turnOn() {
        System.out.println(this.getClass().getSimpleName() + " has been activated by an item being sent for printing. ");
        System.out.println(this.getClass().getSimpleName()  + " is On: " + isOn());
    }

    @Override
    public void turnOff() {
        System.out.println("Item printed. " + this.getClass().getSimpleName()  + " is going to sleep. ");
        System.out.println(this.getClass().getSimpleName()  + " is On: " + isOn());
    }
}


class Printer331 extends Printer301 {

    // Not an override but for variety: does not have its own isPrinting method but implements the parent one

    @Override
    public void turnOn() {
        System.out.println(this.getClass().getSimpleName()  + " has been activated by an item being sent for printing. (It can " +
                "be turned off by holding the 'Off' button for 3 seconds). ");
        System.out.println(this.getClass().getSimpleName()  + " is On: " + isOn());
    }

    @Override
    public void turnOff() {
        System.out.println("Off button held for 3 seconds. " + this.getClass().getSimpleName()  + " is turning off. ");
        System.out.println(this.getClass().getSimpleName()  + " is On: " + isOn(false));
    }
}
