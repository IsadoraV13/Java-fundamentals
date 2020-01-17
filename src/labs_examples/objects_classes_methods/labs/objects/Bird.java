package labs_examples.objects_classes_methods.labs.objects;

public class Bird {
    String colour;
    double wingSpan;

    public Bird(String colour, double wingSpan) {
        this.colour = colour;
        this.wingSpan = wingSpan;
    }
    public Bird() {} //as soon as we provide a custom constructor, we need to provide a default one if we still want to use it
}
