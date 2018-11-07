//Synchronized Keyworkd / Synchronized Thread
// atomic Integer specjalna klasa ¿e mo¿es inkremenotwac tylko w 1 stepie
// synchronized - kazdy obiek t w java ma Transient lock /Mu text, jesli zoribsz calla to wtedy kolejne thready musza czaekac dopoki lock obiektu nie zostanie uwloniony
// volataile pokazuje ¿e mo¿na lub nie mo¿na dojœæ do zmiennej


public class App {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doWork();

    }

    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count is: " + count);
    }
}
