package org.example;

public class Book {
    private String book_isbn;
    private String book_name;
    private String book_author;
    private int book_publication_year;

    public Book(String isbn, String name, String author, int year){
        this.book_isbn = isbn;
        this.book_name = name;
        this.book_author = author;
        this.book_publication_year = year;
    }

    public String getBook_isbn(){
        return book_isbn;
    }
}
