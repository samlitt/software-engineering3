public class Client {

    int count;

    public static void main(String[] args) {
        Counter counter =  new Counter();
        Thread thread = new Thread(counter);
        thread.start();

    }
}