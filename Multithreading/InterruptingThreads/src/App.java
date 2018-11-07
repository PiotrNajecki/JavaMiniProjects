
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Starting..");
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1E8; i++) {
//					if(Thread.currentThread().isInterrupted()) {
//						System.out.println("Interrupted!");
//						break;
//					}
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted!");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });
        t1.start();
        Thread.sleep(500);
        t1.interrupt();  // to jest tylko flaga, trzeba u¿yæ w kodzie jakieœ przechwytywanie tego zdarzenia
        t1.join();
        System.out.println("Finished.");
    }
}
