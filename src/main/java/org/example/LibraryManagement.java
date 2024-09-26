package org.example;

import java.util.HashMap;

public class LibraryManagement {
    private HashMap<String, Integer> books = new HashMap<>();

    public void addBook(Book book){
        String book_isbn = book.getBook_isbn();
        books.put(book_isbn, books.getOrDefault(book_isbn, 0)+1);
    }

    public boolean isBookAvailable(String book_isbn){
        return books.containsKey(book_isbn);
    }
}
