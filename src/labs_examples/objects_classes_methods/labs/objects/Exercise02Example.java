package labs_examples.objects_classes_methods.labs.objects;

class Exercise02Example {
    public static void main(String[] args) {
    Dish newDish = new Dish("vegan dish");
    Ingredient ingredientOne = new Ingredient("eggs");
    Ingredient ingredientTwo = new Ingredient("avocado");
    Ingredient ingredientThree = new Ingredient("sweet potatoes");
        System.out.println("This " + newDish.dishName + " only contains " + ingredientTwo.ingredientName + " and " + ingredientThree.ingredientName + " but no " + ingredientOne.ingredientName);
    }
}

class Dish {
    String dishName;

    public Dish(String dishName) {
        this.dishName = dishName;
    }
}

class Ingredient {
    String ingredientName;

    public Ingredient(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}