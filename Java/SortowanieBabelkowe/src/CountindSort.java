/**
 * Created by TOSHIBA-L775 on 2018-01-30.
 */
public class CountindSort {
    public static void main(String[] args) {

        int pom1;
        int[] tablica1 = {3, 5, 1, 2, 9, 8, 6, 4, 7, 0};
        int[] tablica2 = new int[10];

        int k = 1;
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = 0;
        }

        for (int i = 0; i < tablica1.length; i++) {
            tablica2[tablica1[i]] = tablica2[tablica1[i]] + 1;
        }

        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[j]; j++) {
                System.out.println(j);
            }
        }
    }
}


