package labs_examples.objects_classes_methods.labs.objects;

// create a class for the main method, whereby the instantiated object 'MyAirplane' is created
class MyAirplane {
    public static void main(String[] args) {
        Model myModel = new Model("707");
        SeatCapacity mySeatCapacity = new SeatCapacity(myModel, 400);
        Speed mySpeed = new Speed(67, 456, myModel);
        Destination myDestination = new Destination("New York");
        Airplane myAirplane = new Airplane(myModel, 800, 600, mySeatCapacity, mySpeed, myDestination);

        System.out.println("This " + myModel.model + " has a seat capacity of " + mySeatCapacity.seatCap + " and is flying to " + myDestination.destination + " at a speed of " + mySpeed.speed + ". It has a fuel capacity of " + myAirplane.fuelCap + " litres, and is currently at " + myAirplane.currentFuelLevel + " litres.");
        System.out.println(myAirplane.toString());

    }
}

// create one or more classes for attributes of the class Airplane
class Model {
    String model;

    public Model(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                '}';
    }
}

class SeatCapacity {
    int seatCap;
    Model model;

    public SeatCapacity(Model model, int seatCap) {
        this.seatCap = seatCap;
        this.model = model;
    }

    @Override
    public String toString() {
        return "SeatCapacity{" +
                "seatCap=" + seatCap +
                ", model=" + model +
                '}';
    }
}

// class Speed requires object modelSpeed as input
class Speed {
    int tailWind;
    int speed;
    Model model;

    public Speed(int tailWind, int speed, Model model) {
        this.tailWind = tailWind;
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "tailWind=" + tailWind +
                ", speed=" + speed +
                ", model=" + model +
                '}';
    }
}

class Destination {
    String destination;

    public Destination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destination='" + destination + '\'' +
                '}';
    }
}

// create a class for the blueprint of objects 'Airplane'
public class Airplane {

    Model model;
    double fuelCap;
    double currentFuelLevel;
    SeatCapacity seatCapacity;
    Speed speed;
    Destination destination;
    // I am not including ModelSpeed - is that correct?

    public Airplane(Model model, double fuelCap, double currentFuelLevel, SeatCapacity seatCapacity, Speed speed, Destination destination) {
        // not including modelSpeed
        this.model = model;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.seatCapacity = seatCapacity;
        this.speed = speed;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model=" + model +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel=" + currentFuelLevel +
                ", seatCapacity=" + seatCapacity +
                ", speed=" + speed +
                ", destination=" + destination +
                '}';
    }
}