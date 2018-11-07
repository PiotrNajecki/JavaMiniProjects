package example;

//Semaphore implementation

public class Semaphore {
	private boolean signal = false;
	
	public synchronized void take() {
		//The take() method sends a signal which is stored internally in the Semaphore. 
		//The release() method waits for a signal. When received, the signal flag is cleared again, and the release()
		//method exited.
		this.signal = true; 
		this.notify();
		
	}
	public synchronized void release() throws InterruptedException {
		while(!this.signal) {
			wait();
		}
		this.signal=false;
	}
}
