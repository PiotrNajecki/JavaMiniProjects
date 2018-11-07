import java.util.Random;
import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2017-12-21.
 */
public class Dice {
    public static void main(String[] args) {
        Random rand = new Random(6);
        int x = rand.nextInt((6) + 1);
        System.out.println("Zgadnij liczbę");
        Scanner entering = new Scanner(System.in);
        int zmienna = entering.nextInt();
        try {
            if (zmienna == x) {
                System.out.println("Wpisałes dobrze");
            } else {
                throw new MyCustomException("Nie zgadles");
            }
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}





