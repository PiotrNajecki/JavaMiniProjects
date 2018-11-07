/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
public class Application5 {
    public static void main(String[] args) {
        int[] values = new int[3];
        values[0] = 4;
        values[1] = 456;
        values[2] = 5689;

        for (int i = 0; i < values.length; i++) {
            System.out.println("W tablicy na pozycji " + i + " mamy numer " + values[i]);
        }

        int[] values2 = {5, 6, 7};
        for (int i = 0; i < values2.length; i++) {
            System.out.println("W tablicy na pozycji " + i + " mamy numer " + values2[i]);
        }

        String[] wordsds = new String[3];
        wordsds[0] = "Hello";
        for (String x : wordsds) {
            System.out.println(x);
        }

        for (int x : values2) {
            System.out.println(x);
        }
    }
}
