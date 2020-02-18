package labs_examples.objects_classes_methods.labs.objects;

public class Workout {
    public static void main(String[] args) {
        Exercise exerciseOne = new Exercise("warm up");
        Exercise exerciseTwo = new Exercise("lower body", "strength", "legs", "low intensity");
        Exercise exerciseThree = new Exercise("HIIT", "cardio", "high intensity");

        System.out.println("Today's morning WOD will start with a " + exerciseOne.exerciseName + " followed by a " + exerciseThree.exerciseName + " session which will contain " + exerciseThree.intensity  + " (" + exerciseThree.exerciseType + ") exercises" + " and this afternoon's session will be a " +exerciseTwo.exerciseName + " " + exerciseTwo.intensity + " (" + exerciseTwo.exerciseType + ") session to work on the " + exerciseTwo.muscleGroup);

        // Do I create Workout methods here??
        Exercise workoutOne = new Exercise("WOD 1");
        Exercise workoutTwo = new Exercise("WOD 2", "strength", "upper body", "low intensity");
        Exercise workoutThree = new Exercise("WOD 3", "endurance", "low intensity");

        System.out.println(workoutOne.toString());
        System.out.println(workoutTwo.toString());
        System.out.println(workoutThree.toString());
    }
}

class Exercise {
    String exerciseName;
    String muscleGroup;
    String exerciseType;
    String intensity;

    public Exercise(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Exercise(String exerciseName, String exerciseType, String muscleGroup, String intensity) {
        this.exerciseName = exerciseName;
        this.exerciseType = exerciseType;
        this.muscleGroup = muscleGroup;
        this.intensity = intensity;
    }

    public Exercise(String exerciseName, String exerciseType, String intensity) {
        this.exerciseName = exerciseName;
        this.exerciseType = exerciseType;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseName='" + exerciseName + '\'' +
                ", muscleGroup='" + muscleGroup + '\'' +
                ", exerciseType='" + exerciseType + '\'' +
                ", intensity='" + intensity + '\'' +
                '}';
    }
}