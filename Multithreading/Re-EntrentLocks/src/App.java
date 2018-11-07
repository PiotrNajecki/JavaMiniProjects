import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class App {
    // Producer-Consumer pattern(wzorzec)


    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);  // data structure trzyma data item s z maks ilsocia 10
    // its threade safe nie musisz martwisc sie synchronizacja

//	private static void producer() throws InterruptedException {
//		Random random = new Random();
//		while(true) {
//			queue.put(random.nextInt(100));
//			
//		}
//		
//	}

//	private static void consumer() throws InterruptedException {
//		Random random = new Random();
//		while(true) {
//			Thread.sleep(100);
//			if (random.nextInt(10)==0) {
//				Integer value = queue.take();
//				System.out.println("Taken value: "+value + "; Queue size is: "+queue.size());
//				
//			}
//		}
//		
//	}


    public static void main(String[] args) throws InterruptedException {
        final Runner runner = new Runner();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        runner.finished();
    }
}
