/**
 * Created by TOSHIBA-L775 on 2018-01-30.
 */
public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int l;
        int pom;
        int[] tablica = {3, 5, 12, 1, 2, 9, 8, 6, 4, 7, 0, 10, 1, 3};
        int a = 0;
        for (int i = 0; i < tablica.length; i++) {
            l = 0;
            for (int j = 0; j < (tablica.length - 1 - i); j++) {
                if (tablica[j] > tablica[j + 1]) {
                    pom = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = pom;
                    l++;
                }
            }
            if (l == 0) {
                System.out.println("Liczba porównań (tutaj koniec): " + i);
                break;
            }
            System.out.println("Liczba porównań: " + i);
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }
}
