/**
 * Created by TOSHIBA-L775 on 2018-01-23.
 */
public class TablicaDwuwymiarowa {
    public static void main(String[] args) {
        int[][] tab = {{10, 15, 20, 30}, {51, 231, 212, 12}, {51, 21, 576, 21}, {12, 3, 5, 8}};
        funkcja(tab);
    }

    public static void funkcja(int[][] tab) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + tab[i][i];
        }
        System.out.println("Wynikiem jest: " + suma);
    }
}
