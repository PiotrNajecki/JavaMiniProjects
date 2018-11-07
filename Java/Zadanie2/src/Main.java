import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created by TOSHIBA-L775 on 2018-01-17.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new LinkedList<>();
        lista.add(3);
        lista.add(8);
        lista.add(7);
        lista.add(3);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Consumer<Integer> consumer = c -> {
            System.out.println(c);
        };

        lista.forEach(element -> System.out.println(element));
        System.out.println("Za pomocą interfejsu funkcyjnego Consumer");
        lista.forEach(element -> consumer.accept(element));

        BiConsumer<String, String> biConsumer = (x, y) -> {
            System.out.println(String.valueOf(Integer.parseInt(x) + Integer.parseInt(y)));
        };
        biConsumer.accept("10", "20");

        BiFunction<String, String, Integer> bifunction = (a, b) -> {
            return Integer.parseInt(a) + Integer.parseInt(b);
        };
        System.out.println(bifunction.apply("10", "25"));
    }
}







