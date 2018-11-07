/**
 * Created by TOSHIBA-L775 on 2017-12-16.
 */
// * Treśc zadania:
// * Proszę napisać program, który na ekranie wypisze n razy wiadomość „Witaj świecie”. Wartość n powinna zostać podana przez użytkownika.

import java.util.Scanner;

public class Zad1_WitajSwiecieNRazy {

    public static void main(String[] args) {
        System.out.println("Wpisz ile razy wyświetlić napis \"Witaj świecie\": ");
        Scanner wpisywanie = new Scanner(System.in);
        int n = wpisywanie.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("WItaj świecie!");
        }
    }
}
