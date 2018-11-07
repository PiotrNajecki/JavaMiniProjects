/**
 * Created by TOSHIBA-L775 on 2017-12-13.
 */
public class zad5 {
    public static void main(String args[]) {

        //// zadanie 1
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //// zadanie 2
        System.out.println();
        int i = 1;
        while (i <= 20) {
            i++;
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //// zadanie 3
        /// a
        for (int a = 1; a <= 20; a++) {
            if (a % 2 == 0) {
                System.out.println("Liczba " + a + " jest parzysta");
            } else {
                System.out.println("Liczba " + a + " jest nieparzysta");
            }

        }
        //// zadanie 3
        //// b
        System.out.println();

        int b = 1;
        while (b <= 20) {
            if (b % 2 == 0) {
                System.out.println("Liczba " + b + " jest parzysta");
            } else {
                System.out.println("Liczba " + b + " jest nieparzysta");
            }

            b++;
        }
        System.out.println();

        //// zadanie 3
        ///// c
        int c = 1;
        do {
            if (c % 2 == 0) {
                System.out.println("Liczba " + c + " jest parzysta");
            } else {
                System.out.println("Liczba " + c + " jest nieparzysta");
            }

            c++;
        } while (c <= 20);
    }
}
