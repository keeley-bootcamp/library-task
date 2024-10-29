package com.lloyds.library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public class Patron {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Book> booksBorrowed;

    public Patron(String firstName, String lastName, String email) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public void borrowBook(Book book) {
        book.setAvailable(false);
        booksBorrowed.add(book);
    }

    public void returnBook(Book book) {
        for (Book book1 : booksBorrowed) {
            if (book1 == book) {
                booksBorrowed.remove(book1);
            }
        }
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", bookBorrowedIds=" + booksBorrowed +
                '}';
    }
}
