import java.util.concurrent.ThreadLocalRandom;

public class CallbackClient {
    boolean stop;
    Counter counter = new Counter();
    public CallbackClient() {
        stop = false;
        CallbackCaller caller = new CallbackCaller(this); // delegiert asynchronen Aufruf
        while (!stop){
            try{
                synchronized (this) {
                    wait(ThreadLocalRandom.current().nextInt(1000, 3001));
                }
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(!stop){
                counter.count();
            }
        }
    }

    public void callback(String string) {
        System.out.println(string);
        stop = true;
    }
    public static void main(String[] args) { new CallbackClient(); }

}
