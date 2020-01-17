package labs_examples.objects_classes_methods.labs.objects;

public class BirdController {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.colour = "green";
        parrot.wingSpan = 2.33;

        Bird pigeon = new Bird("grey", 3.4);

        int num = multiply(2, 3);
        System.out.println(num);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
