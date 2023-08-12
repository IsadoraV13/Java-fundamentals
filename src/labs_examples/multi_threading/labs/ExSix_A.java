package labs_examples.multi_threading.labs;

public class ExSix_A implements Runnable {
    Thread thread;
    int i;
    Sync sync = new Sync();

    public ExSix_A(String name, int i) {
        thread = new Thread(this, name);
        this.i = i;
        thread.start();
    }

    @Override
    public void run() {
        sync.syncThreads(thread, i);
    }

}

class Sync {
    public synchronized void syncThreads(Thread thread, int i) {
        for (; i <= 100; i+=2) {
            System.out.println(thread.getName() + " is printing " + i);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            notifyAll();

    }
}