package labs_examples.multi_threading.labs;

public class ExOne_RunnableA implements Runnable {
    Thread thread01;

    public ExOne_RunnableA(String name) {
        thread01 = new Thread(this, name);
        thread01.start();
    }

    @Override
    public void run() {
        System.out.println("Runnable class ExOne_RunnableA already has the start method in its constructor so creating a new " +
                "object also calls the run method");
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // added priority to demo Exercise_03
        System.out.println(thread01.getName() + " from ExOne_RunnableA is complete. It's priority was: " +Thread.currentThread().getPriority());
    }

}
