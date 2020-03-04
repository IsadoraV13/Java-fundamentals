package labs_examples.multi_threading.labs;

public class ExTwo extends Thread {
    public ExTwo(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println("This thread extends the Thread class and has the start method in its constructor");
        System.out.println("It can be paused and re-started ...");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Re-start");
        }
    }
}
