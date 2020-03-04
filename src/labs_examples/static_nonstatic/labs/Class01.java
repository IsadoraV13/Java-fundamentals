package labs_examples.static_nonstatic.labs;

public class Class01 {
    public static void main(String[] args) {
        //1) A static method calling another static method in the same class
        System.out.println("1): A static method calling:");
        staticSameClass();
        System.out.println();

        //2) A static method calling a non-static method in the same class
        System.out.println("2): A static method calling: ");
        Class01 objOne = new Class01();
        objOne.nonStaticSameClass();
        System.out.println();

        //3) A static method calling a static method in another class
        System.out.println("3)");
        Class02.staticDifferentClass();
        System.out.println();

        //4) A static method calling a non-static method in another class
        System.out.println("4)");
        Class03 objThree = new Class03();
        objThree.nonStaticDifferentClass();
        System.out.println();
    }

    public static void staticSameClass() {
        System.out.println("a static method in the same class");
    }


    public void nonStaticSameClass() {
        System.out.println("a non-static method in the same class");
        System.out.println();
        System.out.println("This non-static method also calls and prints out 5) - 8)");
        System.out.println("***************************************************");

        //5) A non-static method calling a non-static method in the same class
        System.out.println("5): A non-static method calling: ");
        anotherNonStaticSameClass();

        //6) A non-static method calling a non-static method in another class
        System.out.println("6): A non-static method calling: ");
        Class03 anotherObjThree = new Class03();
        anotherObjThree.nonStaticDifferentClass();

        //7) A non-static method calling a static method in the same class
        System.out.println("7): A non-static method calling: ");
        staticSameClass();

        //8) A non-static method calling a static method in another class
        System.out.println("8): A non-static method calling: ");
        Class02.staticDifferentClass();
        System.out.println("***************************************************");

    }

    public void anotherNonStaticSameClass() {
        System.out.println("another non-static method in the same class");
    }
}
