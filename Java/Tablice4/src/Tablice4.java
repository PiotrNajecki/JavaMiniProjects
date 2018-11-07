/**
 * Created by TOSHIBA-L775 on 2018-01-23.
 */
public class Tablice4 {
    public static void main(String[] args) {
        int[] tab = new int[4];
        tab[0] = 10;
        tab[1] = 15;
        tab[2] = 20;
        tab[3] = 25;

        int[] tab1 = {10, 15, 20};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        funkcja(1, 2, tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void funkcja(int a, int b, int tab[]) {
        int x = tab[a - 1];
        tab[a - 1] = tab[b - 1];
        tab[b - 1] = x;
    }
}
