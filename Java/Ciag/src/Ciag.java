import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by TOSHIBA-L775 on 2018-01-24.
 */
public class Ciag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(function(a, b));
    }

    public static int function(int a, int b) {
        int suma=0;
        while (a<=b) {
            suma=suma+a;
            a++;

        }

        return suma;
    }

}
