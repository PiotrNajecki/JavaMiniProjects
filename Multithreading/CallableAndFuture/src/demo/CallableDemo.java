package demo;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	private void psvm() {
		// TODO Auto-generated method stub

	
	
	// Java's Callable class function name
	// Unlike a Runnable Thread, Callable returns a value
	// To use Callable function, you need to implement call() function - where as it is run method for Runnable class
	// Callable needs to be submitted to Executor service to run.
	
	
	
	ExecutorService executorService = Executors.newCachedThreadPool();
	Future<Integer> future = executorService.submit(new Callable<Integer>() {

		@Override
		public Integer call() throws Exception {
			Random random = new Random();
			return random.nextInt(10000);
		}
		
		
	});
	
	try {
		System.out.println(future.get());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	executorService.shutdown();
	
	
	
	}
	
	
	
}
