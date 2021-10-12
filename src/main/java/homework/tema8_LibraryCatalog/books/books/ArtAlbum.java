package homework.tema8_LibraryCatalog.books.books;

import homework.tema8_LibraryCatalog.books.PaperQuality;

public class ArtAlbum extends Book {

    private PaperQuality paperQuality;

    public ArtAlbum(String name, String numberOfPages, String author, PaperQuality paperQuality) {
        super(name, numberOfPages, author);
        this.paperQuality = paperQuality;
    }



    public PaperQuality getPaperQuality() {
        return paperQuality;
    }



    @Override
    public String toString() {
        return "ArtAlbum{" +
                "paperQuality=" + paperQuality +
                '}';
    }
}
