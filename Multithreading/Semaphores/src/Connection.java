import java.util.concurrent.Semaphore;

public class Connection {
	private static Connection instance = new Connection();
	
	private Semaphore sem = new Semaphore(10);
	private int connections = 0;
	
	private Connection() {
	}
	
	public static Connection getInstance() {
		return instance;
	}
	
	public void connect() {
		synchronized (this) {
			connections++;
			System.out.println("Cunttent connections: "+connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this) {
			connections--;
		}
	}
}
