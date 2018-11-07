/**
 * Created by TOSHIBA-L775 on 2018-01-25.
 */
public class Silnia {
    public static void main(String[] args) {

        System.out.println(silnia(4));
    }

    public static int silnia(int n) {
        if (n > 0) {
            return n * silnia(n - 1);
        }
        return 1;
    }
}