package task1;

import java.util.concurrent.ThreadLocalRandom;

public class PollingClient {
    static Counter counter = new Counter();
    public static void main(String[] args) {
        PollingCaller caller = new PollingCaller();
        while(!caller.returned()) { //Polling
            try{
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3001));
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(!caller.returned()){
                counter.count();
            } // hier könnte etwas sinnvolles gemacht werden
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
        System.out.println(caller.getString());
    }
}
