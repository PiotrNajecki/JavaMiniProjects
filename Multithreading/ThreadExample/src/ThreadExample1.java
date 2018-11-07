/**
 * Created by TOSHIBA-L775 on 2018-02-06.
 */
class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Hello World!");
        }
    }
}

public class ThreadExample1 {
    public static void main (String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("jo");
    }

}
