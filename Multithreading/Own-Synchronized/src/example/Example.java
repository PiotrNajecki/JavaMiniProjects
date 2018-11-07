package example;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counterA = new Counter();
		Counter counterB = new Counter();
		Thread threadA = new CounterThread(counterA);
		Thread threadB = new CounterThread(counterA);
		
		threadA.start();
		threadB.start();
	}
}
