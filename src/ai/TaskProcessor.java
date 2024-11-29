package ai;

import java.util.Random;

// TaskProcessor.java
public class TaskProcessor {
    private Random random = new Random();

    public void processAsync(String input, TaskCallback callback) {
        new Thread(() -> {
            try {
                // Wait 4-10 seconds
                Thread.sleep(random.nextInt(6000) + 4000);

                // Caesar cipher implementation
                String result = caesarCipher(input, 3);
                callback.onResult(result);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }

    private String caesarCipher(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append((char) (((c - base + shift) % 26) + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}
