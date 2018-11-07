package pl.sda.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class BookComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear()-o2.getYear();
    }

}

/// sortować można tylko Listy, zbiorów nie można



