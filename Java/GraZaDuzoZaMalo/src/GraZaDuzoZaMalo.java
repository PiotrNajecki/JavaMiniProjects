import java.util.Random;
import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2018-01-23.
 */
public class GraZaDuzoZaMalo {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println("Traf liczbe");
        int x = generator.nextInt(128) + 1;

        Scanner scanner = new Scanner(System.in);
        int y;
        do {
            System.out.println("Wpisz liczbe:");
            y = scanner.nextInt();
            if (x < y) {
                System.out.println("Podales za duza wartosc");
            } else if (x > y) {
                System.out.println("Podales za mala wartosc");

            } else {
                System.out.println("Gratulacje");

            }

        } while (y != x);
    }
}
