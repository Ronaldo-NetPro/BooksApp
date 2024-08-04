
package za.ac.tut;

/**
 *
 * @author RONALDO TSETSEWA
 */
public interface BooksManagerInterface {
    
    public abstract void addBook(Book book, int index);
    public Book[] getBooks();
}
