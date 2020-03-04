package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) throws InterruptedException {
        ExSix_A RunnableOne = new ExSix_A("thread 1",1);
        ExSix_A RunnableTwo = new ExSix_A("thread 2", 2);

    // My method doesn't work!

    }
}