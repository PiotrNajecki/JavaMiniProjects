package pl.sda.collectionsexample;

import java.util.List;

/**
 * Created by TOSHIBA-L775 on 2018-02-22.
 */
public class Library {
    private String city;
    private List<Book> books;

    public Library(String city, List<Book> books) {
        this.city = city;
        this.books = books;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
