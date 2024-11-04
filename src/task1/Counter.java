import java.util.concurrent.ThreadLocalRandom;

public class Counter {
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

    public void count() {
                increment();
                System.out.println(count);
    }
}
