package pl.sda.collectionsexample;

/**
 * Created by TOSHIBA-L775 on 2018-02-21.
 */
public class Book {

    private String author;
    private String title;
    private int pages;
    private int year;
    private int month;
    private String description;

    public Book(String author, String title, int pages, int year, int month, String description) {
        super();
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
        this.month = month;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", pages=" + pages + ", year=" + year + ", month="
                + month + ", description=" + description + "]";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (getPages() != book.getPages()) return false;
        if (getYear() != book.getYear()) return false;
        if (getMonth() != book.getMonth()) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getDescription() != null ? getDescription().equals(book.getDescription()) : book.getDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getAuthor() != null ? getAuthor().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + getPages();
        result = 31 * result + getYear();
        result = 31 * result + getMonth();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}