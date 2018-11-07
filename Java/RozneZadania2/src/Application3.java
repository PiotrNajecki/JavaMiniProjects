/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */

import java.util.Scanner;


public class Application3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Wpisz liczbę: ");
            value = scanner.nextInt();
        }
        while (value != 5);
        System.out.println("mamy 5");
    }
}
