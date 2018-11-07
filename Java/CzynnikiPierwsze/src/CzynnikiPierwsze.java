/**
 * Created by TOSHIBA-L775 on 2018-02-02.
 */

// 4.    Czynnikami pierwszymi liczby 13195 są liczby 5,7, 13, 29
// Jaki jest największy pierwszy dzielnik liczby 600851475143?


public class CzynnikiPierwsze {
    public static void main(String[] args) {
        long liczba = 600851475143l;
        System.out.println(NWD(liczba));
    }


    public static int NWD(double liczba) {
        int i = 2;
        while (liczba != 1) {
            if (liczba % i == 0) {
                liczba /= i;
            } else {
                i++;
            }
        }
        return i;
    }
}
