package labs_examples.enumerations.labs;

public enum Menu {
    MON("chicken", "salad", "smoothie"),
    TUE("gado gado", "red rice", "local sweet"),
    WED("beef", "sweet potatoes", "brownie"),
    THU("nasi goreng", "corn fritters", "smoothie"),
    FRI("tofu with veggies", "salad or rice", "ice cream");

    private String main;
    private String sides;
    private String dessert;

    Menu(String main, String sides, String dessert) {
        this.main = main;
        this.sides = sides;
        this.dessert = dessert;
    }

    public String getMain() {
        return main;
    }

    public String getSides() {
        return sides;
    }

    public String getDessert() {
        return dessert;
    }
}
