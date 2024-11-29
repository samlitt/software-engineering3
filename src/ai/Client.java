package ai;

// Client.java
import java.util.Random;

public class Client {
    private int counter = 0;
    private boolean running = true;
    private Random random = new Random();

    public void start() {
        // Start async task
        TaskProcessor processor = new TaskProcessor();
        processor.processAsync("HALLO WELT", new TaskCallback() {
            @Override
            public void onResult(String result) {
                System.out.println("\nVerschlüsseltes Ergebnis: " + result);
                running = false;
            }
        });

        // Counter loop
        while (running) {
            try {
                int waitTime = random.nextInt(2000) + 1000; // 1-3 seconds
                Thread.sleep(waitTime);
                System.out.println("Zähler: " + (++counter));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public static void main(String[] args) {
        new Client().start();
    }
}

