/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
public class App {
    public static void main (String[] args) {
    Robot sam = new Robot();
    sam.speak("I am Sam"); }
}

class Robot {
    public void speak(String text) {
        System.out.println("Hello "+text);
    }
}


