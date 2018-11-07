/**
 * Created by TOSHIBA-L775 on 2017-12-13.
 */

import java.lang.Math;

public class zad3 {

    public static void main(String args[]) {
        double a, b, c, delta, x1, x2;
        a = 0;
        b = 4f;
        c = 1f;
        delta = (b * b) - (4 * a * c);

        if (a != 0) {
            if (delta > 0) {
                x1 = (b * (-1) - Math.sqrt(delta)) / (2 * a);
                x2 = (b * (-1) + Math.sqrt(delta)) / (2 * a);
                System.out.println("Wynikiem sa pierwiatki: " + x1 + " oraz " + x2);
            } else if (delta == 0) {
                x1 = (b * (-1)) / (2 * a);
                System.out.println("Wynikiem jest jeden pierwiatek: " + x1);
            } else {
                System.out.println("Równanie nie ma pierwiastków/rozwiązania");
            }
        } else {
            System.out.println("To nie jest rownanie kwadratowe. Sprawdz wartosc zmiennej a");
        }
    }
}


