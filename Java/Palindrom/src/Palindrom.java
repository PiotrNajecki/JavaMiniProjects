/**
 * Created by TOSHIBA-L775 on 2018-02-06.
 */
public class Palindrom {
    public static void main(String[] args) {
        System.out.println(czyPalindrom(9009));
        int max = -1;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                System.out.println(i + " " + j);
                int palindrom = i * j;
                if (czyPalindrom(palindrom)) {
                    max = palindrom;
                }
            }
        }
    }

    public static boolean czyPalindrom(int liczba) {
        String liczbaN = String.valueOf(liczba);
        int lewy = 0;
        int prawy = liczbaN.length() - 1;
        while (lewy < prawy) {
            if (liczbaN.charAt(lewy) != liczbaN.charAt(prawy)) {
                return false;
            }
            lewy++;
            prawy--;
        }
        return true;
    }
}
