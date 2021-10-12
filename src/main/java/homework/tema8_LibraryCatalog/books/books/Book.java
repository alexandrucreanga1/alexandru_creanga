package homework.tema8_LibraryCatalog.books.books;

public class Book {
    private String name;
    private String numberOfPages;
    private String author;


    protected Book(String name, String numberOfPages, String author) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;

    }


    public String getName() {
        return name;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", author='" + author + '\'' +
                '}';
    }





}
