/**
 * Created by TOSHIBA-L775 on 2018-01-24.
 */
public class ResztazDzielenia {
    public static void main(String[] args) {
        int a=40;
        int b=5;
        int iloscRazy=0;

        while (a>=b) {
            a-=b;
            iloscRazy++;
        }
        System.out.println("Reszta z dzielenia: "+a + "\nIle razy liczba "+b+" miesci się w liczbie "+(b*iloscRazy+a)+": "+iloscRazy);
    }
}
