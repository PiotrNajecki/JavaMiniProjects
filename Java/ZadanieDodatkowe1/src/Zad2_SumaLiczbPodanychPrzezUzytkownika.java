

/**
 * Created by TOSHIBA-L775 on 2017-12-16.
 */

// * Treśż zadania:
// * Proszę napisać program, który obliczy sumę liczb podanych przez użytkownika. Podanie przez użytkownika liczby 0 powinno wypisać na ekranie wynik i zakończyć działanie programu.

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Zad2_SumaLiczbPodanychPrzezUzytkownika {
    public static void main(String[] args) {
        Scanner strumien = new Scanner(System.in);
        System.out.println("Wpisz liczny ktore chcesz dodac:\nJesli wpiszesz liczbe 0 to program zakonczy sie");
        float suma = 0;
        float sumaParzyste = 0;
        float enterNumber;
        do  {
            enterNumber = strumien.nextFloat();
            if (enterNumber %2 == 0) {
                sumaParzyste+=enterNumber;
            }
        suma += enterNumber;
        } while (enterNumber != 0);
        System.out.println("Suma wpisanych liczb wynosi: " + suma);
        System.out.println("Suma wpisanych liczb parzystych rowna sie: "+sumaParzyste);
    }
}
