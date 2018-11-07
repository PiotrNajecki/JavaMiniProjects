/**
 * Created by TOSHIBA-L775 on 2017-12-13.
 */
public class zad4 {
    public static void main(String args[]) {
        boolean wartosc = false;
        int a = 10;
        int b = 10;
        switch (a % b) {
            case 0: {
                wartosc = true;
                System.out.println(wartosc);
                break;
            }
            default: {
                wartosc = false;
                System.out.println(wartosc);
                break;
            }
        }
        int x = 10;
        if (x < 0) {
            x = Math.abs(x);
        }
        System.out.println(x);
        int y = 7;
    }
}
