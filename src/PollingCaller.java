public class PollingCaller extends Thread {
    private boolean returned = false;
    public PollingCaller () { this.start(); }
		Cesar cesar = new Cesar();

    public void run() {
        System.out.println(" entfernter Aufruf läuft u. wartet auf Taste ");
				try {
						int sleepTime = 4000 + (int)(Math.random() * (10000 - 4000));
						Thread.sleep(sleepTime);
				}
				catch(Exception e) {
						System.out.println(e);
				}

        returned = true;
    }
    public boolean returned() { return returned; }

		public String getString() {
				return cesar.getString();
		}
}
