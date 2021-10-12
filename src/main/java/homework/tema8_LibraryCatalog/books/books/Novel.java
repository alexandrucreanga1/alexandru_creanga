package homework.tema8_LibraryCatalog.books.books;

public class Novel extends Book {
    private String type;


    public Novel(String name, String numberOfPages, String author, String type) {
        super(name, numberOfPages, author);
        this.type = type;
    }


    public String getType() {
        return type;
    }



    @Override
    public String toString() {
        return "Novel{" +
                "type='" + type + '\'' +
                '}';
    }
}
