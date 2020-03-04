package labs_examples.multi_threading.labs;

public class ExOne_RunnableB implements Runnable{
    // no parametised constructor

    @Override
    public void run() {
        System.out.println("Runnable class ExOne_RunnableB only has an empty constructor so start() needs to be invoked on a new" +
                " thread from the main method");
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // added priority to demo Exercise_03
        System.out.println(Thread.currentThread().getName() + " from ExOne_RunnableB is complete. It's priority was: " +Thread.currentThread().getPriority());
    }
}
