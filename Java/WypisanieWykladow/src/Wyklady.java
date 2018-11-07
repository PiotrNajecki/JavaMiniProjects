import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by TOSHIBA-L775 on 2018-01-23.
 */
public class Wyklady {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zobcz pozostale wyklady na dzisiejszy dzien. Wpisz godzine");
        int x = scanner.nextInt();
        System.out.print(x + "-> ");

        switch (x) {
            case 8:
                System.out.println("8: Matematyka");
            case 9:
                System.out.println("9:  Matematyka");
            case 10:
                System.out.println("10: Matematyka");
            case 11:
                System.out.println("11: Prawo");
            case 12:
                System.out.println("12:  Prawo");
            case 13:
                System.out.println("13: Przerwa");
            case 14:
                System.out.println("14: Laboratorium");
            case 15:
                System.out.println("15: Laboratorium");
            case 16:
                System.out.println("16: Systemy");
            case 17:
                System.out.println("17: Systemy");
            case 18:
                System.out.println("18: Systemy");
        }
    }
}




