import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2018-01-24.
 */
public class SumaCyfrLiczbyNaturalnej {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podej liczbę: ");
        int a = scanner.nextInt();
        int suma = 0;
        while (a >= 1) {
            suma += a % 10;                  // suma=suma+a%10;
            a /= 10;                        // a=a/10;
        }
        System.out.println(suma);
    }
}
