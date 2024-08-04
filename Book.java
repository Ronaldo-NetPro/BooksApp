
package za.ac.tut;

/**
 *
 * @author RONALDO TSETSEWA
 */
public class Book {
    
    //a book has an author and a title
    private String title;
    private Author author;

    public Book() {
        title = "How to Program ";
        author = new Author();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    
    
    
    
}
