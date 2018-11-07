
class Runner extends Thread {

	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			System.out.println("Hello" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}


public class App {

	public static void main(String[] args) {
		Runner runner1 = new Runner();   /// obie metody dzialaja jednoczesnie i to jest ca³y punkt tego jak ma to dzia³ac
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
	}
}
