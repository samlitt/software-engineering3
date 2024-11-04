package task1;

import java.io.IOException;

public class CallbackCaller extends Thread{
    CallbackClient client;
		Cesar cesar = new Cesar();

    public CallbackCaller (CallbackClient c) { client = c; this.start(); }

    public void run() { // Hier könnte ein entfernter Aufruf stehen
				try {
						int sleepTime = 4000 + (int)(Math.random() * (10000 - 4000));
						Thread.sleep(sleepTime);
				}
				catch(Exception e) {
						System.out.println(e);
				}
        //System.out.println(" entfernter Aufruf läuft u. wartet auf return ");
				String string = cesar.getString();

				client.callback(string);
        try {
            System.in.read();
        } catch (IOException e) { e.printStackTrace(); }

        client.callback(string);
    }
}
