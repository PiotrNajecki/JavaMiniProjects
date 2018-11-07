
import static java.lang.Math.*;

import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * Created by TOSHIBA-L775 on 2017-10-01.
 */
public class FunkcjeMatematyczneiWielkieLiczbyBigDecimal {

    public static void main(String args[]) {
        double liczba = 9.0;
        int b = 3;
        double pierwiastek = sqrt(liczba);
        double potega = pow(liczba, b);

        System.out.println("Pierwiastek z " + liczba + " wynosi: " + pierwiastek + "\n" + "Liczba " + liczba + " podniesiona do potegi " + b + " to " + potega);

        BigDecimal wielkaLiczba = new BigDecimal("1231231231231231231256788");
        BigDecimal wielkaLiczba2 = new BigDecimal("2");
        System.out.println(wielkaLiczba.toString());

        BigDecimal suma = wielkaLiczba.add(wielkaLiczba2);
        System.out.println("Suma " + suma.toString());

        BigDecimal iloczyn = wielkaLiczba.multiply(wielkaLiczba2);
        System.out.println("Iloczyn to " + iloczyn.toString());

        BigDecimal iloraz = wielkaLiczba.divide(wielkaLiczba2);
        System.out.println("iloraz to " + iloraz.toString());
    }
}
