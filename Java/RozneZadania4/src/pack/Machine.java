package pack;

/**
 * Created by TOSHIBA-L775 on 2017-10-14.
 */
public class Machine {
    protected int x = 10;

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");

    }

    public void do1(int x) {
        System.out.println(String.valueOf(x));
    }
}
