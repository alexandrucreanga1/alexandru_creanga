package homework.tema8_LibraryCatalog.books;

import homework.tema8_LibraryCatalog.books.books.ArtAlbum;
import homework.tema8_LibraryCatalog.books.books.Book;
import homework.tema8_LibraryCatalog.books.books.Novel;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    private List<Novel> novels = new ArrayList<>();
    private List<ArtAlbum> artAlbums = new ArrayList<>();



    public void listNovel() {
        System.out.println("List of novels: ");
        for (int i = 0; i < this.novels.size(); i++) {
            System.out.println((i + 1) + ". Name: " + this.novels.get(i).getName() + ";" +
                    " Number of pages: " + this.novels.get(i).getNumberOfPages() + ";" +
                    " Author: " + this.novels.get(i).getAuthor() + ";" +
                    " Type: " + this.novels.get(i).getType() + ";");
        }
    }


    public void addBook(Book book) {
        if(book instanceof Novel)   {
            novels.add((Novel) book);
        } else if(book instanceof ArtAlbum) {
            artAlbums.add((ArtAlbum) book);
        } else {
            System.out.println("Not supported type of book!");
        }
    }

    public void listArtAlbums() {
        System.out.println("List of Art Albums: ");
        for (int i = 0; i < this.artAlbums.size(); i++) {
            System.out.println((i + 1) + ". Name: " + this.artAlbums.get(i).getName() + ";" +
                    " Number of pages: " + this.artAlbums.get(i).getNumberOfPages() + ";" +
                    " Author: " + this.artAlbums.get(i).getAuthor() + ";" +
                    " Type: " + this.artAlbums.get(i).getPaperQuality() + ";");
        }
    }

    public boolean removeNovel(Book book) {
        this.novels.remove(book);
        System.out.println(book.getName()+ " removed from the Novel list.");
        return true;
    }


    public boolean removeArtAlbum(Book book) {
        this.artAlbums.remove(book);
        System.out.println(book.getName()+ " removed from the Art Album list.");
        return true;
    }



}
