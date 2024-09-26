package org.example;

import org.junit.jupiter.api.Test;
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
        int required_copies = 2;
        String result1 = library.borrowBook(book, required_copies);
        assertEquals("Book borrow successfully", result1);

        String result2 = library.borrowBook(book, required_copies);
        assertEquals("Book is not available",result2);
    }
}