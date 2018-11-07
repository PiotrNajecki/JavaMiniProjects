import java.util.Random;

/**
 * Created by TOSHIBA-L775 on 2018-01-22.
 */
public class TabliceDwuWymiarowe {
    public static void main(String[] args) {
        int[][] tablica2 = new int[5][5];
        int[][] tablica3 = new int[5][5];
        int[] tablicaMaks = new int[5];
        int[] tablicaMin = new int[5];

        Random generator = new Random();
        //Przypisanie wartosci do tablicy 2
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < tablica2[i].length; j++) {
                tablica2[i][j] = generator.nextInt(10) - 5;
                System.out.print(tablica2[i][j] + " ");
                if (j == 4) {
                    System.out.println();
                }
            }

        // Przepisanie wartosci z tablicy 2 do tablicy 3
        System.out.println();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                tablica3[j][i] = tablica2[i][j];
            }

        // wypisanie warosci z tablicy 3
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                System.out.print(tablica3[i][j] + " ");
                if (j == 4) {
                    System.out.println();
                }
            }

        int maks;
        int min;

        for (int i = 0; i < 5; i++) {
            maks = tablica3[i][0];
            min = tablica3[i][0];
            for (int j = 0; j < tablica3[i].length; j++) {
                if (maks < tablica3[i][j]) {
                    maks = tablica3[i][j];
                    tablicaMaks[i] = maks;
                } else {
                    tablicaMaks[i] = maks;
                }
                if (min > tablica3[i][j]) {
                    min = tablica3[i][j];
                    tablicaMin[i] = min;
                } else {
                    tablicaMin[i] = min;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(tablicaMaks[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(tablicaMin[i] + " ");
        }
    }
}
