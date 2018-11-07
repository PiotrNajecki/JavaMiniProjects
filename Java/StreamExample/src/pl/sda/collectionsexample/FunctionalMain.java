package pl.sda.collectionsexample;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

/**
 * Created by TOSHIBA-L775 on 2018-02-26.
 */
public class FunctionalMain {
    public static void main(String[] args) {

        Function<String, Integer> stringCounter = a -> a.length();
        Integer apply = stringCounter.apply("ala ma kota");
        System.out.println(apply);

        ///----------------------------------

        Function<Book, String> bookTitleExtractor = b -> b.getTitle();
        System.out.println(bookTitleExtractor.apply(new Book("", "Pan Tadeusz", 0, 0, 1, "")));
        ///-----------------

        Function<String, Integer> counterA = a -> {
            int counter = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'a') {
                    counter++;
                }
            }
            return counter;
        };
        System.out.println(counterA.apply("ala ma kota"));
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(11));
        Predicate<String> isLongthGreaterthan10 = a -> a.length() > 10;
        System.out.println(isLongthGreaterthan10.test("dgfgfd"));

        ///////--------------

        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
        System.out.println(adder.apply(13, 14));

        /////--------------------

        BiFunction<String, Integer, List<String>> biFunction = (a, b) -> {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < b; i++) {
                list.add(a);
            }
            return list;
        };

        biFunction.apply("ala ma kota", 10)
                .stream()
                .forEach(System.out::println);

        //////////----------------------------------

        BinaryOperator<String> binaryOperator = (a, b) -> a.concat(b);
        System.out.println(binaryOperator.apply("ala ma", " kota"));

        ///////////--------------------------------


    }


}
