package example2;

import example.Semaphore;

public class SendingThread {
    Semaphore semaphore = null;

    public SendingThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void run() {
        while (true) {
            //do something, then signal
            this.semaphore.take();
        }
    }
}