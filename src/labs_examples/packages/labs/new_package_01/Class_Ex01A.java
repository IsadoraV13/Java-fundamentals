package labs_examples.packages.labs.new_package_01;

public class Class_Ex01A {

    public static void main(String[] args) {
        Class_Ex01B.demoProtectionWithinPackage();
        demoProtectionWithinClass();
//        Class_Ex02.demoProtectionOutsidePackage(); / cannot be accessed as it in a different package
    }

    protected static void demoProtectionWithinClass() {
        System.out.println("Methods within the same class can be accessed");
    }

    protected static void demoProtectionWithinParentClass() {
        System.out.println("This is a parent class in a different package");
    }
}
