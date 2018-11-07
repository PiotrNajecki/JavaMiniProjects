/**
 * Created by TOSHIBA-L775 on 2017-10-12.
 */

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter a line of text: ");
        String line = input.nextLine();
        System.out.println("Eneter a number: ");
        int value = input.nextInt();
        System.out.println("Eneter a floating value: ");
        double value2 = input.nextDouble();
        System.out.println("wpisałes nowa linie: " + line);
        System.out.println("wpisales liczbe: " + value);
        System.out.println("wpisales liczbe: " + value2);

        System.out.println("Enter a value: ");
        int value3 = input.nextInt();
        while (value3 != 5) {
            System.out.println("Enter a value: ");
            value3 = input.nextInt();
        }
        System.out.println("mamy 5");
    }
}
