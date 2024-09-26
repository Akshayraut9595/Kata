package org.example;

import java.util.HashMap;

public class LibraryManagement {
    private HashMap<String, Integer> books = new HashMap<>();

    public void addBook(Book book){
        String book_isbn = book.getBook_isbn();
        books.put(book_isbn, books.getOrDefault(book_isbn, 0)+book.getBook_copies());
    }

    public boolean isBookAvailable(String book_isbn){
        return books.containsKey(book_isbn);
    }

    public String borrowBook(Book book, int required_copies){
        String book_isbn = book.getBook_isbn();
        if(books.containsKey(book_isbn) && books.get(book_isbn) >= required_copies){
            books.put(book_isbn, books.getOrDefault(book_isbn, 0)-required_copies);
            if(books.get(book_isbn) <= 0){
                books.remove(book_isbn);
            }

            return "Book borrow successfully";
        }

        return "Book is not available";
    }
}
