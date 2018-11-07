
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future = executor.submit(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(4000);

                if (duration > 2000) {
                    throw new IOException("Sleeping for too long.");
                }

                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                System.out.println("Starting...");
                System.out.println("Finished.");
                return duration;
            }
        });

//		executor.submit(new Runnable() {
//			public void run() {
//				Random random = new Random();
//				int duration = random.nextInt(4000);
//				
//				try {
//					Thread.sleep(duration);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				System.out.println("Starting...");
//				
//				
//				
//				System.out.println("Finished.");
//			}
//		});
        executor.shutdown();
        System.out.println("Result is: " + future.get());
    }
}
