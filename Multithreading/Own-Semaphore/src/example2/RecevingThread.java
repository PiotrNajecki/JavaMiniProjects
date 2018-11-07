package example2;

import example.Semaphore;

public class RecevingThread {
    Semaphore semaphore = null;

    public void ReceivingThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() throws InterruptedException {
        while (true) {
            this.semaphore.release();
            //receive signal, then do something...
        }
    }
}