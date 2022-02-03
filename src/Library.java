import java.util.ArrayList;

public class Library {


    /*
    Skriv en klasse kaldet Bibliotek,der indeholder en liste af Bog objekter.

    •Indsæt tre forskellige bøgeri Biblioteket
    •Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter,
        og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN
     */

    ArrayList<Book> books = new ArrayList<Book>();

    Book firstBook = new Book(2300,"Narnia",2005);
    Book secondBook = new Book(2391, "Harry Potter", 1997);
    Book thirdBook = new Book(4821, "Lord of the Rings", 1954);

    public boolean isThisBookAvailable(Book book) {
        if (books.contains(book)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Library libraryClass = new Library();

        libraryClass.books.add(libraryClass.firstBook);
        libraryClass.books.add(libraryClass.secondBook);
        libraryClass.books.add(libraryClass.thirdBook);

        Book b = new Book(0000,"Harry Potter",1937);
        Book b2 = new Book(2300,"Narnia",2005);

        System.out.println(libraryClass.isThisBookAvailable(b)); // false
        System.out.println(libraryClass.isThisBookAvailable(b2)); //true

    }
}


