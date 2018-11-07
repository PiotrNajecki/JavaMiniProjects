/**
 * Created by TOSHIBA-L775 on 2018-01-24.
 */
public class Banknoty2 {
    public static void main(String[] args) {
        int kwota=198;
        System.out.println("Banknotow 20: "+kwota/20);
        kwota %=20;
        System.out.println("Banknotow 10: "+kwota/10);
        kwota %=10;
        System.out.println("Banknotow 10: "+kwota/5);
        kwota %=5;
        System.out.println("Banknotow 10: "+kwota/2);
        kwota %=2;
        System.out.println("Banknotow 10: "+kwota/1);
        kwota %=1;


    }


}
