package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
class LibraryManagementTest {
    //Test for adding book in library
    @Test
    void addBookTest(){
        LibraryManagement library = new LibraryManagement();
        Book book = new Book("A1","Object-Oriented Analysis and Design with Applications","Grady Booch",2007, 1);
        library.addBook(book);
        assertTrue(library.isBookAvailable("A1"));
    }

    //Test for borrow book from library
    @Test
    void borrowBookTest(){
        LibraryManagement library = new LibraryManagement();
        Book book = new Book("A1","Object-Oriented Analysis and Design with Applications","Grady Booch",2007, 2);
        library.addBook(book);
        User user = new User("123","Akshay Raut", "akshayraut@gmail.com");
        int required_copies = 2;
        String result1 = library.borrowBook(book, required_copies, user);
        assertEquals("Book borrow successfully", result1);

        String result2 = library.borrowBook(book, required_copies, user);
        assertEquals("Book is not available",result2);
    }

    // Test for return book
    @Test
    void returnBookTest(){
        LibraryManagement library = new LibraryManagement();
        Book book = new Book("A1","Object-Oriented Analysis and Design with Applications","Grady Booch",2007, 2);
        library.addBook(book);
        User user = new User("123","Akshay Raut", "akshayraut@gmail.com");
        int required_copies = 2;
        String result1 = library.borrowBook(book, required_copies, user);
        assertEquals("Book borrow successfully", result1);

        String result2 = library.borrowBook(book, required_copies, user);
        assertEquals("Book is not available",result2);

        int number_of_copies_returning = 2;
        assertTrue(library.returnBook(book,number_of_copies_returning, user));
    }

    // Test for showing available books in library
    @Test
    void showAvailableBooksTest(){
        LibraryManagement library = new LibraryManagement();
        Book book1 = new Book("A1","Object-Oriented Analysis and Design with Applications","Grady Booch",2007, 2);
        Book book2 = new Book("B1","Design Patterns: Elements of Reusable Object-Oriented Software"," Erich Gamma",1994, 2);
        library.addBook(book1);
        library.addBook(book2);

        ArrayList<Book> availableBooks = new ArrayList<>(Arrays.asList(book1, book2));
        assertEquals(availableBooks,library.showAvailableBooks());
    }
}