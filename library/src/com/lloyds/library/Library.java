package com.lloyds.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public Book searchByISBN(int ISBN) {
        for (Book book : library) {
            if (book.getISBN() == ISBN) {
                return book;
            }
        }
        return null;
    }

    public Book searchByAuthor(String author) {
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }
}
