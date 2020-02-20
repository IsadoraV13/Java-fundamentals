package labs_examples.objects_classes_methods.labs.objects;

import java.util.ArrayList;

// create a class for the main method, whereby the instantiated object 'MyAirplane' is created
class MyAirplane {
    public static void main(String[] args) {
        Model myModel = new Model();
        Seat seatOne = new Seat(7, "xx");
        myModel.getSeats().add(seatOne);
        Speed mySpeed = new Speed(67, 456, myModel);
        Destination myDestination = new Destination("New York");
        Airplane myAirplane = new Airplane(myModel, 800, 600, mySpeed, myDestination);

        System.out.println("This " + myModel.getModel() + " has a seat capacity of " + myModel.getSeats().size() + " and is flying to "
                + myDestination.getDestination() + " at a speed of " + mySpeed.getSpeed() + ". It has a fuel capacity of "
                + myAirplane.getFuelCap() + " litres, and is currently at " + myAirplane.getCurrentFuelLevel() + " litres.");
        System.out.println(myAirplane.toString());

    }
}

// create one or more classes for attributes of the class Airplane
class Model {
    private String model;
    private ArrayList<Seat> seats = new ArrayList();
    private int defaultSeatCapacity;

    // parametised constructor: takes input parameters for model and seat capacity (not used)
    public Model(String model, int defaultSeatCapacity) {
        this.model = model;
        this.defaultSeatCapacity = defaultSeatCapacity;
    }
    // empty constructor: no defined input parameter in brackets but has a default model value for new instances
    public Model() {
        model = "737";
    }

    // parametised constructor: takes a model as input and then has a default seat capacity (not used)
    public Model(String model) {
        this.model = model;
        this.defaultSeatCapacity = 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getDefaultSeatCapacity() {
        return defaultSeatCapacity;
    }

    public void setDefaultSeatCapacity(int defaultSeatCapacity) {
        this.defaultSeatCapacity = defaultSeatCapacity;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                '}';
    }
}

class Seat {
    private int legRoom;
    private String fabric;

    public Seat(int legRoom, String fabric) {
        this.legRoom = legRoom;
        this.fabric = fabric;
    }

    public int getLegRoom() {
        return legRoom;
    }

    public void setLegRoom(int legRoom) {
        this.legRoom = legRoom;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "legRoom=" + legRoom +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}

// class Speed requires object modelSpeed as input
class Speed {
    private int tailWind;
    private int speed;

    public Speed(int tailWind, int speed, Model model) {
        this.tailWind = tailWind;
        this.speed = speed;
    }

    public int getTailWind() {
        return tailWind;
    }

    public void setTailWind(int tailWind) {
        this.tailWind = tailWind;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "tailWind=" + tailWind +
                ", speed=" + speed +
                '}';
    }
}

class Destination {
    private String destination;

    public Destination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
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

    private Model model;
    private double fuelCap;
    private double currentFuelLevel;
    private Speed speed;
    private Destination destination;


    public Airplane(Model model, double fuelCap, double currentFuelLevel, Speed speed, Destination destination) {
        this.model = model;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
        this.speed = speed;
        this.destination = destination;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model=" + model +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel=" + currentFuelLevel +
                ", speed=" + speed +
                ", destination=" + destination +
                '}';
    }
}