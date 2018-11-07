import java.util.Random;

/**
 * Created by TOSHIBA-L775 on 2018-01-30.
 */
public class Losowanie {
    private static int[] tablica = new int[100];
    private static int rozmiar;

    public static void main(String[] args) {
        utworzenieTablicy();
        for (int i = 0; i < 70; i++) {
            System.out.println(losowanie());
        }
    }

    public static int losowanie() {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(rozmiar);
        int wynik = tablica[wylosowanaLiczba];
        usuwanie(wylosowanaLiczba);
        return wynik;
    }


    public static void utworzenieTablicy() {
        for (int i = 0; i < 100; i++) {
            tablica[i] = i;
        }
        rozmiar = 100;
    }


    public static void usuwanie(int wylosowanaLiczba) {
        if (wylosowanaLiczba != (rozmiar - 1)) {
            int pomoc = tablica[rozmiar - 1];
            tablica[rozmiar - 1] = tablica[wylosowanaLiczba];
            tablica[wylosowanaLiczba] = pomoc;
            rozmiar--;
        } else {
            rozmiar--;
        }
    }
}
