package org.example;

public class Book {
    private String book_isbn;
    private String book_name;
    private String book_author;
    private int book_publication_year;
    private int book_copies;

    public Book(String isbn, String name, String author, int year, int copies){
        this.book_isbn = isbn;
        this.book_name = name;
        this.book_author = author;
        this.book_publication_year = year;
        this.book_copies = copies;
    }

    public String getBook_isbn(){
        return book_isbn;
    }

    public int getBook_copies(){
        return book_copies;
    }

}
