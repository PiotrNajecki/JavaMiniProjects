package example2;

// zmieniamy zliczanie na zliczanie z jakas ustalona granica

public class BoundedSemaphore {
	private int signals = 0;
	private int bound = 0;

	public BoundedSemaphore(int bound) {
		super();
		this.bound = bound;
	}
	
	public synchronized void take() throws InterruptedException {
		while (this.signals==bound) {
			wait();
		}
		this.signals++;
		this.notify();
	}
	
	public synchronized void release() throws InterruptedException {
		while (this.signals == 0) {
			wait();
		}
		this.signals--;
		this.notify();
	}
}
