package labs_examples.packages.labs.new_package_02;

import labs_examples.packages.labs.new_package_01.Class_Ex01A;

public class Class_Ex02 {
    public static void main(String[] args) {
        demoProtectionOutsidePackage();
        Class_Ex02 obj = new Class_Ex02();
        obj.runSubClassMethod();
    }

    protected void runSubClassMethod() {
        subClass01A obj = new subClass01A();
        obj.demoProtectionSubClass();
    }

    protected static void demoProtectionOutsidePackage() {
        System.out.println("This will not print/cannot be accessed when called from package01 but will print when called" +
                " from package02");
        demoPrivateWithinClass();
    }

    private static void demoPrivateWithinClass() {
        System.out.println("This private method can be accessed/is being called from another method within the same class");
    }

    class subClass01A extends Class_Ex01A {
        protected void demoProtectionSubClass() {
            Class_Ex01A newObj = new subClass01A();
            newObj.demoProtectionWithinParentClass();
            System.out.println("Methods of subclasses can access protected parent methods even when they are in " +
                    "a different package");
        }

    }

}
