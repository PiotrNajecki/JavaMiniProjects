package pl.sda.collectionsexample;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class BookMain {

    public static void main(String[] args) {

        Set<Book> books = new HashSet<>();
        books.add(new Book("Sienkiewicz", "Ogniem i mieczem", 1234, 1915, 1, "dsgsfdgfd"));
        books.add(new Book("Prus", "Lalka", 994, 1932, 4, "fdsafdsaf"));
        books.add(new Book("Mickiewicz", "Pan Tadeusz", 755, 1874, 7, "dsafadf"));
        books.add(new Book("Orzeszkowa", "Nad Niemnem", 1355, 1945, 8, "safadsf"));
        books.add(new Book("Słowacki", "Kordian", 654, 1925, 1, "adsfadsfadsf"));
        books.add(new Book("Słowacki", "Balladyna", 654, 1925, 1, "adsfadsfadsf"));

        /////------ Wypisywanie ksiazek gdzie autor zaczyna sie na litere S------


        for (Book book : books) {
            if (book.getAuthor().startsWith("S")) {
                System.out.println(book.toString());
            }

        }

        ////----- to samo co wyzej ale strumieniowo
        System.out.println();


        books.stream()
                .filter(b -> b.getAuthor().startsWith("S"))
                // .forEach(b -> System.out.println(b));
                .forEach(System.out::println);

        /// --- posortuj zbiór po roku wydania i wypisz cały zbior ksiazek


        System.out.println();
        List<Book> bookList = new ArrayList<>(books);
        Collections.sort(bookList, new BookComparator());


        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println();
        books.stream()
                .sorted((b1, b2) -> b1.getYear() - b2.getYear())
                .forEach(System.out::println);


        System.out.println();
        books.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .forEach(System.out::println);


        System.out.println();
        books.stream()
                .collect(Collectors.toList());


        System.out.println();
        List<String> titles = new ArrayList<>();
        for (Book book : bookList) {
            titles.add(book.getTitle());
        }

        for (String title : titles) {
            System.out.println(title);
        }

        System.out.println();
        books.stream()
                .map(b -> b.getTitle())
                .sorted(String::compareTo)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        ////----------------- wypisz informację czy w grudniu znajduje się ksiazka wyadana w grudniu
        boolean anyMatchBook = books.stream()
                .anyMatch(b -> b.getMonth() == 1);
        System.out.println(anyMatchBook);


        //// ------ wypisz informacje, czy wszystkie ksiazky zostaly wydane przed 2000 rokiem
        System.out.println();
        boolean allMatchBooks = books.stream().
                allMatch(b -> b.getYear() < 2000);
        System.out.println(allMatchBooks);


        System.out.println();
        long liczbaObiektow = books.stream()
                .count();
        System.out.println(liczbaObiektow);


        ////// ------------------ Lista bibliotek

        List<Library> libraries = new ArrayList<>();
        List<Book> bookList1 = new ArrayList<>(books);
        libraries.add(new Library("Warszawa", bookList1.subList(0, 3)));
        libraries.add(new Library("Kraków", bookList1.subList(3, 6)));

        libraries.stream()
                .map(lib -> lib.getBooks())
                .flatMap(bList -> bList.stream())
                .forEach(System.out::println);


        libraries.stream()
                .filter(lib -> lib.getCity().equals("Warszawa"))
                .map(lib -> lib.getBooks())
                .flatMap(bList -> bList.stream())
                .forEach(System.out::println);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kowalski");
        map.put(2, "Nowak");
        map.put(3, "Suwała");
        map.put(4, "Najecki");
        map.put(5, "Sienkiewicz");

        System.out.println();
        map.entrySet()
                .stream()
                .filter(e -> e.getValue().startsWith("S"))
                .map(e -> e.getValue())
                .forEach(System.out::println);


        Optional<Integer> minOptional = map.keySet()
                .stream()
                .min(Integer::compareTo);

        if (minOptional.isPresent()) {
            System.out.println(minOptional.get());
        }

        minOptional.ifPresent(System.out::println);

        // minOptional.ifPresent(obj -> System.out::println);

        //minOptional.filter(4);

        minOptional.map(obj -> String.valueOf(obj) + " to jest wynik metody map")
                .ifPresent(System.out::println);
        //    map.values().parallelStream().sorted()
    }
}


