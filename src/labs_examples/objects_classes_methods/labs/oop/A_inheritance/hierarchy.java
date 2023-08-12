package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class hierarchy {
    public static void main(String[] args) {
        WorkOut wodOne = new WorkOut("generic workout","whole body", 0.5f);
        WorkOut wodTwo = new Strength("Strength", "back", 3f, 0.85f);
        WorkOut wodThree = new StrengthEndurance("Strength endurance", "legs", 1f, 0.75f);
        WorkOut wodFour = new Cardio("Cardio", "whole body", 0); //is 0 a float?
        WorkOut wodFive = new HIIT("HITT", "whole body", 0.f, "rapid");

        wodOne.warmUp();
        wodTwo.warmUp();
        wodThree.warmUp();
        wodFour.warmUp();
        wodFive.warmUp();

    }
}


class WorkOut {
    String name;
    String muscleGroup;
    float minutesRest;

    public WorkOut(String name, String muscleGroup, float minutesRest) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.minutesRest = minutesRest;
    }

    public void warmUp() {
        System.out.println("Warm up for " + name + ": 10 min run on treadmill");
    }
}

class Strength extends WorkOut {
    float intensity;

    public Strength(String name, String muscleGroup, float minutesRest, float intensity) {
        super(name, muscleGroup, minutesRest);
        this.intensity = intensity;
    }

    @Override
    public void warmUp() {
        System.out.println("Warm up for " + name + ": 5 min run on treadmill followed by elastic band drills");
    }
}

class StrengthEndurance extends Strength {

    public StrengthEndurance(String name, String muscleGroup, float minutesRest, float intensity) {
        super(name, muscleGroup, minutesRest, intensity);
    }

    @Override
    public void warmUp() {
        System.out.println("Warm up for " + name + ": 5 min run on treadmill followed by active stretching");
    }
}

class Cardio extends WorkOut {

    public Cardio(String name, String muscleGroup, float minutesRest) {
        super(name, muscleGroup, minutesRest);
    }

    @Override
    public void warmUp() {
        System.out.println("Warm up for " + name + ": 5 min run on cardio machine of choice and slowly transition into the WOD");
    }
}

class HIIT extends Cardio {
    String pace;

    public HIIT(String name, String muscleGroup, float minutesRest, String pace) {
        super(name, muscleGroup, minutesRest);
        this.pace = pace;
    }
    // MUST I have a method override here? Or could I call the Cardio method on a HIIT object??
    @Override
    public void warmUp() {
        System.out.println("Warm up for " + name + ": 5 min run on treadmill followed by exercises to elevate HR");
    }
}