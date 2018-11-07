package TreeSet;

import java.util.TreeSet;

/**
 * Created by TOSHIBA-L775 on 2018-02-26.
 */

//Stwórz zbiór TreeSet<Integer> i dodaj do niego liczby będące kwadratami liczb od 1 do 20
//        (wartości od 1 do 400). Następnie za pomocą wyrażeń lambda wykonaj poniższe instrukcje:
//        a) Wypisz elementy zbioru na różne sposoby, używając toString, pętli "for each", iteratora.
//        b) Wydziel fragment zbioru zawierający tylko elementy mniejsze od 50 używając metody
//        headSet().
//        c) Do wybranego fragmentu spróbuj dodać element mniejszy od 50. Sprawdź zawartość
//        oryginalnego zbioru.
//        d) Do wybranego fragmentu spróbuj dodać element większy od 50.

public class KlasaTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> zbiorLiczb = new TreeSet<>();
        for (int i=1; i<=20; i++) {
            zbiorLiczb.add(i*i);
        }


    }

}
