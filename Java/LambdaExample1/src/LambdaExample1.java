import java.util.ArrayList;

/**
 * Created by TOSHIBA-L775 on 2018-02-06.
 */
public class LambdaExample1 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add(null);
        lista.add(null);
        lista.add("Piotrek");
        lista.add("Robert");

        for (String element : lista) {
            System.out.println(element);
        }

        lista.removeIf(element -> (element == null || element == "Piotrek"));


        System.out.println("\nDrukowanie zmienionej listy:");
        for (String element : lista) {
            System.out.println(element);
        }


    }


}


