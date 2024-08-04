
package za.ac.tut;

/**
 *
 * @author RONALDO TSETSEWA
 */
public class BooksManager implements BooksManagerInterface {

    private Book[] books;

    public BooksManager() {
        books = new Book[5];
    }
    
    
    @Override
    public void addBook(Book book, int index) {
        books[index] = book;
    }

    @Override
    public Book[] getBooks() {
        return books;
    }
    
}
