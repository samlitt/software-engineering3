public class CallbackClient {
    boolean stop;
    public CallbackClient() {
        stop = false;
        CallbackCaller caller = new CallbackCaller(this); // delegiert asynchronen Aufruf
        while (!stop){
            System.out.print(".");
            try { Thread.sleep(1000);
            } catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }

    public void callback(String string) {
        System.out.println(string);
        stop = true;
    }
    public static void main(String[] args) { new CallbackClient(); }

}
