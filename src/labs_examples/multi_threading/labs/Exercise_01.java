package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        ExOne_RunnableB runnableTwo = new ExOne_RunnableB();
        Thread tTwo = new Thread(runnableTwo,"Thread 2");
        //creating third thread to demo Exercise_03 and assign higher priority to Thread 3
        ExOne_RunnableB runnableThree = new ExOne_RunnableB();
        Thread tThree = new Thread(runnableThree,"Thread 3");
        tThree.setPriority(Thread.MAX_PRIORITY);
        // starting the 3 threads to see which one finishes first
        ExOne_RunnableA runnableOne = new ExOne_RunnableA("Thread 1");
        tTwo.start();
        tThree.start();

    }

}