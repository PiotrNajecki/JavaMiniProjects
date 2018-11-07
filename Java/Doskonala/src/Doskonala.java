import java.util.ArrayList;

/**
 * Created by TOSHIBA-L775 on 2018-01-23.
 */
public class Doskonala {
    public static void main(String[] args) {
        isPerferctNum(6);
    }

    public static void isPerferctNum(int a) {
        double polowa = Math.floor(a/2);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=1; i<=polowa; i++) {
            if (a%i==0) {
                lista.add(i);
            }

        }

        int suma=0;
        for(Integer i: lista) {
            suma+=i;
        }

        if (suma == a) {
            System.out.println("Liczba doskonała");
        } else {
            System.out.println("To nie jest liczba doskonala");
        }

    }

}
