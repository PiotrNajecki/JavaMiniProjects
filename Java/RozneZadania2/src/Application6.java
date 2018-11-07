/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */
public class Application6 {

    public static void main(String[] args) {

        int[][][] grid = {{{1, 2, 6}, {6}, {9, 4}}, {{4, 5}, {88, 3}}, {{7, 0}, {1, 8}}};

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int k = 0; k < grid[i][j].length; k++) {
                    System.out.println("Na pozycji [" + i + "," + j + "," + k + "] jest liczba: " + grid[i][j][k]);
                }
            }
        }

        String[][] words = new String[2][];
        words[0] = new String[4];
        words[0][1] = "hi there";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println("Na pozycji [" + i + "," + j + "," + "] jest liczba: " + words[i][j]);
            }
        }
    }
}



