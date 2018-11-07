import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2018-01-24.
 */
public class Srednia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int suma = 0;
        int liczba = 0;

        System.out.println("Podawaj liczby:");

        while (x != 100) {
            liczba++;
            x = scanner.nextInt();
            suma += x;
        }

        suma = suma - 100;
        System.out.println("Podano 100, podaj jeszcze tylko 3 liczby");
        x = scanner.nextInt();
        suma += x;
        x = scanner.nextInt();
        suma += x;
        x = scanner.nextInt();
        suma += x;
        System.out.println("Suma: " + suma);
        double srednia = (double) suma / (liczba + 2);
        System.out.println("Wynik/średnia: " + srednia);
    }
}
