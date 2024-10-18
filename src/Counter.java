import java.util.concurrent.ThreadLocalRandom;

public class Counter implements Runnable{
    private int INCREMENT_AMOUNT = 20;
    private int count;

    Counter() {
        count = 0;
    }

    int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }

    @Override
    public void run() {
        try {
            for(int i=0;i<INCREMENT_AMOUNT;i++) {
                synchronized (this) {
                    wait(ThreadLocalRandom.current().nextInt(1000, 3001));
                }
                increment();
                System.out.println(count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
