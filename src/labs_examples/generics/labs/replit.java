package labs_examples.generics.labs;

public class replit {
    public static void main(String[] args) {

        // Step 1) Create an object of MyGeneric class below and call the print() method on it
        MyGeneric<String, Integer> obj = new MyGeneric("object one", 123);
        obj.print();
        // Step 2) Create another object of MyGeneric class below using a different data type and call the print() method on it
        MyGeneric<String, Integer> newObj = new MyGeneric("object two", 23);
        newObj.print();
        System.out.println();
        // Step 3) modify the class below to require two generic types - then modify your objects above so it still works

        // Step 1) create an array of 5 strings then call the printArray() method and pass the String array
        String [] stringArray = {"eggs", "avocado", "toast", "mushrooms", "coffee"};
        printArray(stringArray);

        // Step 1) create an array of 5 ints then call the printArray() method and pass the int array
        Integer [] intArray = {5, 7, 9, 11, 13};
        printArray(intArray);

        // Step 1) create an array of 5 doubles then call the printArray() method and pass the double array
        Double [] doubleArray = {1.0 , 2.0, 3.0, 4.0, 5.0};
        printArray(doubleArray);
        System.out.println();

        Generic<String> stringGeneric = new Generic();
        String[] stringGenericArray = {"one", "two", "three"};
        Generic<Integer> integerGeneric = new Generic();
        Integer[] integerGenericArray = {1, 2, 3};
    }

    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println(); // NOTE what this line does
    }
}


class MyGeneric <T, Z> {

    T strVal;
    Z intVal;

    public MyGeneric(T strVal, Z intVal) {
        this.strVal = strVal;
        this.intVal = intVal;
    }

    public void print() {
        System.out.println(strVal);
        System.out.println(intVal);
    }
}

//  Create a generic class called Generic
//  Inside Generic, create a method called printArray()
//  printArray must print the contents of an array that it receives as a parameter

class Generic<T> {

    public void printArray(T[] inputArray) {
        for(T element : inputArray) {
            System.out.printf("%s%n", element);
        }
    }
}
