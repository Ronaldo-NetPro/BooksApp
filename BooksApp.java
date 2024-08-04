
package booksapp;


import java.util.Scanner;
import za.ac.tut.Author;
import za.ac.tut.Book;
import za.ac.tut.BooksManager;

/**
 *
 * @author RONALDO TSETSEWA
 */
public class BooksApp {

    
    public static void main(String[] args) {
        
        //declare variables
        BooksManager bm;
        
        //create an instance of the BooksManager
        bm = new BooksManager();
        
       
        //add books to the list
        addBooksToList(bm);
        
         //get books to the list
        Book[] books = bm.getBooks();
        
        //display all the books
        displayBooks(books);
        
    }
    
    private static void addBooksToList(BooksManager bm){
        
        //declare variables
        String name, title;
        Author author;
        Book book;
        
        //instantiate a scanner
        Scanner kb = new Scanner(System.in);
        
        //add books
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter the name of the Author: " + (i+1)+ " : " );
            name = kb.nextLine();
            
            System.out.print("Please enter book title by " + name + " : ");
            title = kb.next();
            kb.nextLine();
            
            author = new Author();
            
            //set the name of the author
            author.setName(name);
            
            //create an instance of the book class
            book = new Book();
            
            //set the name of the author and also the title of the book
            book.setTitle(title);
            book.setAuthor(author);
            
            //add the book to the list
            bm.addBook(book, i);
        }
        
    }
    
    private static void displayBooks(Book[] books){
            
        //declare some variables
        String name, title;
        
        for (int i = 0; i < 5; i++) {
            
            name = books[i].getAuthor().getName();
            title = books[i].getTitle();
            
            System.out.println((i+1) + " " + name + " " + title);
        }
        
    }
    
    
}
