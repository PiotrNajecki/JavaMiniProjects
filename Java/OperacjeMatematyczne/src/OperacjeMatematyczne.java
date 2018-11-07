/**
 * Created by TOSHIBA-L775 on 2017-12-20.
 */
public class OperacjeMatematyczne {

    OperacjeMatematyczne() {
    }

    OperacjeMatematyczne(int a, int b) {

    }

    static int mnozenie(int a, int b) {
        return a * b;
    }

    static int dodawanie(int a, int b) {
        return a + b;
    }

    static int potegowanie(int a) {
        return a * a;
    }

    public static double pierwiatekZDwoch = 1.42;
    static double pi = 3.14;


    static double poleKola(int a) {
        return pi * a * a;
    }

    public static void main(String[] args) {
        OperacjeMatematyczne op = new OperacjeMatematyczne();
        System.out.println(op.mnozenie(1, 2));
        System.out.println(op.dodawanie(1, 2));
    }
}
