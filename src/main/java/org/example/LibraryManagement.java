package org.example;

import java.util.ArrayList;
import java.util.HashMap;


public class LibraryManagement {
    private HashMap<String, Integer> books = new HashMap<>();
    private HashMap<String, HashMap<String, Integer>> userDetails = new HashMap<>();

    public void addBook(Book book){
        String book_isbn = book.getBook_isbn();
        books.put(book_isbn, books.getOrDefault(book_isbn, 0)+book.getBook_copies());
    }

    public boolean isBookAvailable(String book_isbn){
        return books.containsKey(book_isbn);
    }

    public String borrowBook(Book book, int required_copies, User user){
        String book_isbn = book.getBook_isbn();
        if(books.containsKey(book_isbn) && books.get(book_isbn) >= required_copies){
            books.put(book_isbn, books.getOrDefault(book_isbn, 0)-required_copies);

            HashMap<String, Integer> user_borrowed_books = new HashMap<>();
            String userId = user.getUser_id();
            if(userDetails.containsKey(userId)){
                user_borrowed_books = userDetails.get(userId);
            }

            user_borrowed_books.put(book_isbn, user_borrowed_books.getOrDefault(book_isbn, 0)+1);
            userDetails.put(userId, user_borrowed_books);

            if(books.get(book_isbn) <= 0){
                books.remove(book_isbn);
            }

            return "Book borrow successfully";
        }

        return "Book is not available";
    }

    public boolean returnBook(Book book, int number_of_copies_returning, User user){
        String book_isbn = book.getBook_isbn();
        books.put(book_isbn, books.getOrDefault(book_isbn, 0)+number_of_copies_returning);

        String userId = user.getUser_id();
        HashMap<String, Integer> user_borrowed_books = userDetails.get(userId);
        user_borrowed_books.put(book_isbn, user_borrowed_books.getOrDefault(book_isbn, 0)-number_of_copies_returning);
        userDetails.put(userId, user_borrowed_books);
        return true;
    }
}
