/**
 * Created by TOSHIBA-L775 on 2017-10-13.
 */

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text) {
            case "piotrek":
                System.out.println("mamy 1");
                break;
            case "robert":
                System.out.println("mamy 2");
                break;
            case "stop":
                System.out.println("mamy 3");
                break;
            default:
                System.out.println("Command not recognized");
        }
    }
}
