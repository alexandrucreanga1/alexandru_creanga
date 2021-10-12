package homework.tema8_LibraryCatalog.books;

import homework.tema8_LibraryCatalog.books.books.ArtAlbum;
import homework.tema8_LibraryCatalog.books.books.Book;
import homework.tema8_LibraryCatalog.books.books.Novel;

public class Main {
    public static void main(String[] args) {

        LibraryCatalog libraryCatalog = new LibraryCatalog();


        Book novel1 = new Novel("Povesti Adevarate", "300", "John Smith", "drama");
        Book novel2 = new Novel("Cum sa devii presedinte.Pentru incepatori.", "300", "Klaus Iohanis", "documentar");
        Book novel3 = new Novel("Covid19. Este sau Nu?", "300", "Diana Sosoaca", "life");
        Book novel4 = new Novel("Amintiri din Copilarie", "300", "John Branch", "history");
        Book novel5 = new Novel("Ala bala Portocala", "290", "John Dow", "sci-fi");


        Book artAlbum1 = new ArtAlbum("Viata in imagini", "332", "Smith Criss", PaperQuality.MEDIUM);
        Book artAlbum2 = new ArtAlbum("Unde esti ?", "332", "Elena Elena", PaperQuality.PREMIUM);
        Book artAlbum3 = new ArtAlbum("Noi oamenii", "332", "Alexei Bratianu", PaperQuality.LOW);
        Book artAlbum4 = new ArtAlbum("The Man from Earth", "290", "Emerson Bixby", PaperQuality.LOW);

        libraryCatalog.addBook(novel1);
        libraryCatalog.addBook(novel2);
        libraryCatalog.addBook(novel3);
        libraryCatalog.addBook(novel4);
        libraryCatalog.addBook(novel5);
        libraryCatalog.addBook(artAlbum1);
        libraryCatalog.addBook(artAlbum2);
        libraryCatalog.addBook(artAlbum3);
        libraryCatalog.addBook(artAlbum4);


        libraryCatalog.listNovel();
        libraryCatalog.listArtAlbums();

        libraryCatalog.removeArtAlbum(artAlbum1);
        libraryCatalog.removeNovel(novel1);

        libraryCatalog.listArtAlbums();
    }


}
