/**
 * Created by TOSHIBA-L775 on 2018-02-06.
 */
public class Lambda implements Runnable {


    @Override
    public void run() {

    }

    public static void repeat(int n, Runnable b) {
        for (int i=0; i<n; i++) {
         b.run();
        }

    }
    public static void main(String[] args) {
        repeat(5, () -> System.out.println("Hello"));

    }

}
