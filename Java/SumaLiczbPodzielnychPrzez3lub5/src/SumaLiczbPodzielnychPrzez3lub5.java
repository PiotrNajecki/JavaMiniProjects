/**
 * Created by TOSHIBA-L775 on 2018-01-22.
 */
public class SumaLiczbPodzielnychPrzez3lub5 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 0; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                suma += i;
            } else {
                if (i % 3 == 0) {
                    suma = suma + i;
                }
                if (i % 5 == 0) {
                    suma = suma + i;
                }
            }
        }
        System.out.println(suma);
    }
}
